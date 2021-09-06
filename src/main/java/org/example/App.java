/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for amount of people be inputted
        System.out.println( "How many people? " );
        //number will be inputted and stored as "people"
        int people = scanner.nextInt();

        //print statement asking for amount of pizzas to be inputted
        System.out.println( "How many pizzas do you have? " );
        //number will be inputted and stored as "pizzas"
        int pizzas = scanner.nextInt();

        //print statement asking for amount of slices on each pizza to be inputted
        System.out.println( "How many slices per pizza? " );
        //number will be inputted and stored as "slices"
        int slices = scanner.nextInt();

        //outputting amount of pizzas each person gets and remaining slices
        System.out.format( "%d people with %d pizza(s) (%d slices)\n", people, pizzas, slices );
        System.out.format( "Each person gets %d piece(s) of pizza. \n", (slices * pizzas) / people );
        System.out.format( "There are %d leftover pieces. \n", (slices * pizzas) % people );
    }
}
