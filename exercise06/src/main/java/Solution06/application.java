/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Eric Moore
 */
package Solution06;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
/* Take inputs for age and retirement.
*  Get the differences for age and year.
*  then print out the results to the user. */

public class application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age?: ");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire?: ");
        int retire = in.nextInt();

        int agedif = retire - age;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        /* I am taking the year + agedif to get year when they can retire. */
        int yeardif = year + agedif;

        System.out.println("You have " + agedif + "years left until you can retire.");
        System.out.println("It's " + year + ",so you can retire in" + yeardif + ".");
    }
}
