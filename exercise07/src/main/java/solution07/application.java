/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Eric Moore
 */
package solution07;

import java.util.Scanner;

public class application {
    public static void main (String[] args)
    {
    Scanner scanner = new Scanner(System.in);
	   System.out.print("What is the length of the room in feet: ");
    double length = scanner.nextDouble();
	   System.out.print("What is the width of the room in feet: ");
    double width = scanner.nextDouble();
    /*Area = length*width;*/
    double areasf = length * width;
    /* A square meter is equal to 10.764 square feet. So we do the opposite. */
    double areasm = areasf / 10.764;
	   System.out.println("The area is:" + areasf + " square feet or " + areasm + "square meters");
    }
}
