package task;

import java.util.Scanner;
public class Try { 

	
	
public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	    System.out.println("Enter a coordinate: ");

	    String coordinate = input.nextLine();
	    String[] parts = coordinate.split(",");

	    // if input is (x, y) 
	    // then parts[0] is "(x"
	    // and parts[1] is " y)"

	    String x = parts[0].trim().substring(1).trim();
	    String y = parts[1].trim().substring(0, parts[1].trim().length() - 1).trim();

	    System.out.println(parts);
}
}