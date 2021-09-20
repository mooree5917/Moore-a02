/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Eric Moore
 */
package solution08;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How many people?: ");
        int people = in.nextInt();
        System.out.print("How many pizza's do you have?: ");
        int pizza = in.nextInt();
        System.out.print("How many slices per pizza?: ");
        int slicesPerPizza = in.nextInt();

        int slices = pizza * slicesPerPizza;
        int piecePerPerson = ;
        int leftover = slices % piecePerPerson;

        System.out.println();
        System.out.println();
        System.out.println();

    }
}
