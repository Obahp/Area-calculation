package week3;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the width of the square:");
		int sqWidth = Integer.parseInt(in.nextLine());
		
		System.out.println("Please enter the width of the rectangle:");
		int recWidth = Integer.parseInt(in.nextLine());
		
		System.out.println("Please enter height of the rectangle:");
		int recHeight = Integer.parseInt(in.nextLine());
		
		int sqArea = sqWidth * sqWidth; // calculating the area of a square
		int recArea = recWidth * recHeight; // calculating the area of a rectangle 
		
		System.out.println("The area of a square with a width of 5 is " + sqArea );
		System.out.println("The area of rectangle with a width of 4 and height of 10 is " + recArea );
		
		in.close(); // to close out the scanner in (line 7) that is showing exclamation mark or error.
	}

}
