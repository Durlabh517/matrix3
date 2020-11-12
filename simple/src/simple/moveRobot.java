package simple;
import java.util.Arrays;
import java.util.Scanner;

import simple.MoveObject;

public class moveRobot {

	

	public static void main(String[] args) {
		MoveObject moveObject = new MoveObject();
		int rows = 4;
		int cols = 4;
		String currentPosition = "2,2";
		String direction ="N";
		
		
		String[][] matrix = new String[rows][cols];
		
		
		
	//for (int i = 0; i < matrix.length; i++) {
		//	for (int j = 0; j < matrix[i].length; j++) {
			//	matrix[i][j] = i +"," + j;
				//System.out.print(arrStr[i][j] + " ");
			//}
			//System.out.println("");
	//	}

		
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y] + " ");
//		
			}
			System.out.println("");
		}
		
		System.out.println("matrix.size: \n" +matrix.length);
		System.out.println("matrix.size: \n" +matrix[0].length);
		System.out.println("matrix[2][2] : \n" +matrix[0][1]);
		
		Scanner commandStream = new Scanner(System.in);

	    System.out.println("Enter 0 = quit simulation and print results to ​stdout\n" + 
	    		"1 = move forward one step\n" + 
	    		"2 = move backwards one step\n" + 
	    		"3 = rotate clockwise 90 degrees (eg north to east)\n" + 
	    		"4 = rotate counterclockwise 90 degrees (eg west to south) ");
	    // Numerical input
	   
	    
	    while (commandStream.hasNext()) {
	    	 int command = commandStream.nextInt();
	    	 System.out.println("command: " + command);
	    	 if(command < 0 || command > 4)
	    	 {
	    		 System.out.println("Please only enter the following input - \n"
	    		 		+   "0 = quit simulation and print results to ​stdout\n" + 
	    		    		"1 = move forward one step\n" + 
	    		    		"2 = move backwards one step\n" + 
	    		    		"3 = rotate clockwise 90 degrees (eg north to east)\n" + 
	    		    		"4 = rotate counterclockwise 90 degrees (eg west to south) ");
	    	 }
	    	 
	    	 else if(command == 0)
	    	{
	    		System.out.println("Current Postion After Exit : " +currentPosition);
	    		break;
	    	}
	    	 else if(command == 1 ||command == 2)
	    	 {
	    		 currentPosition = moveObject.move(direction, command,currentPosition, matrix);
	    		 System.out.println("Current Position: " +currentPosition);
	    	 }
	    	
	    	 else if (command == 3 || command == 4)
	    	 {
	    		 direction = moveObject.changeDirection(direction, command);
	    		 System.out.println("Current Direction: " +direction);
	    	 }
	    	
	      }

	}
	

	public String changeDirection(String direction, int command) {

		if(command == 3)
		{
			switch(direction) 
	        { 
	            case "N": 
	                System.out.println("North"); 
	                direction = "E";
	                break; 
	            case "W": 
	                System.out.println("West"); 
	                direction = "N";
	                break; 
	            case "E": 
	                System.out.println("East");
	                direction = "S";
	                break; 
	            case "S": 
	                System.out.println("South"); 
	                direction = "W";
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 
		}
		else if(command == 4)
		{
			switch(direction) 
	        { 
	            case "N": 
	                System.out.println("North"); 
	                direction = "W";
	                break; 
	            case "W": 
	                System.out.println("West"); 
	                direction = "S";
	                break; 
	            case "E": 
	                System.out.println("East");
	                direction = "N";
	                break; 
	            case "S": 
	                System.out.println("South"); 
	                direction = "E";
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 
		}
		return direction; 
	}
	
	public String move(String direction, int command, String currentPosition, String[][] matrix) {
		
		String newPosition =null;
		
			if(findPosition(currentPosition, matrix))
				{
				newPosition= calculateNewPosition(direction,command, currentPosition);
				
				if(!findPosition(newPosition, matrix))
				{
					newPosition = "-1,-1";
				}
				else
				{
					currentPosition=newPosition;
				}
				}
			else {
				System.out.println("The entered position is not within the area of table/matrix,"
						+ " please enter the valid x,y coordinates");
			};
		
		return currentPosition;
		
	}

	private String calculateNewPosition(String direction, int command, String currentPosition) {
		// TODO Auto-generated method stub
		
		String[] xy = currentPosition.split(",");
		String x = xy [0];
		String y = xy [1];
		
		if(command == 1)
		{
		switch(direction) 
        { 
            case "N": 
                System.out.println("North"); 
                y = Integer.toString((Integer.parseInt(y)-1));
                currentPosition=x+","+y;
                break; 
            case "W": 
                System.out.println("West"); 
                x = Integer.toString((Integer.parseInt(x)-1));
                currentPosition=x+","+y;
                break; 
            case "E": 
                System.out.println("East");
                x = Integer.toString((Integer.parseInt(x)+1));
                currentPosition=x+","+y;
                break; 
            case "S": 
                System.out.println("South"); 
                y = Integer.toString((Integer.parseInt(y)+1));
                currentPosition=x+","+y;
                break; 
            default: 
                System.out.println("no match"); 
        } 
		}
		else if(command == 2)
		{
			switch(direction) 
	        { 
	            case "N": 
	                System.out.println("North"); 
	                y = Integer.toString((Integer.parseInt(y)+1));
	                currentPosition=x+","+y;
	                break; 
	            case "W": 
	                System.out.println("West"); 
	                x = Integer.toString((Integer.parseInt(x)+1));
	                currentPosition=x+","+y;
	                break; 
	            case "E": 
	                System.out.println("East");
	                x = Integer.toString((Integer.parseInt(x)-1));
	                currentPosition=x+","+y;
	                break; 
	            case "S": 
	                System.out.println("South"); 
	                y = Integer.toString((Integer.parseInt(y)-1));
	                currentPosition=x+","+y;
	                break; 
	            default: 
	                System.out.println("no match"); 
	        } 
		}
	
		return currentPosition;
	}

	private boolean findPosition(String currentPosition, String[][] matrix) {
		
		String matrixPosition=null;
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            	
            	 try {
            		 matrixPosition= matrix[i][j];
                     System.out.println("Element in the given index is :: "+matrixPosition);
                  } catch(ArrayIndexOutOfBoundsException e) {
                     System.out.println("The index you have entered is invalid");
                     System.out.println("Please enter an index number between 0 and 6");
                     System.out.println(Arrays.toString(matrix));
            	
                if (matrixPosition == currentPosition) {
                     System.out.println("position exists in the matrix");
                     return true;
                }
            }
        }
		
	}
		return false;
	}

}
