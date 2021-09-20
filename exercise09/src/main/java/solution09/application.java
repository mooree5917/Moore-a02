/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Eric Moore
 */
package solution09;

import java.util.Scanner;

public class application {
    public static void main(String[] args)

    {

        final int COVERAGE = 350;

/*declare integers length, width, and height;
*declare double totalSqFt;
*declare double paintNeeded;*/

        int length;
        int width;
        double totalSqFt;
        double paintNeeded;

        Scanner in = new Scanner(System.in);

//read in the length of the room and width.

        System.out.print("Enter length: ");
        length = in.nextInt();

        System.out.print("Enter width: ");
        width = in.nextInt();


//dimensions of the ceiling.

        totalSqFt = width*length;

//Compute the amount of paint needed

        paintNeeded = totalSqFt / COVERAGE;

//Now we need to round up for the cans of paint which we can use math.round.

        System.out.println("You will need to purchase " + Math.round(paintNeeded) + "gallons of paint to cover " + totalSqFt +"square feet.");

    }
}
