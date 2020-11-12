package simple;

import java.util.Arrays;
import java.util.List;

//@Component
public class MoveObject {



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
            		 
            		 if (matrixPosition.equalsIgnoreCase(currentPosition)) {
                        // System.out.println("position exists in the matrix");
                         return true;
                    }
                   
                  } catch(ArrayIndexOutOfBoundsException e) {
                     System.out.println("The index you have entered is invalid");
                     System.out.println("Please enter an index number between 0 and 6");
                     System.out.println(Arrays.toString(matrix));
            	
               
            }
        }
		
	}
		return false;
	}
	
	}