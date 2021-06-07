package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        final double conversion = 0.09290304;

        System.out.print( "What is the length of the room in feet? ");
        int legnth = Integer.parseInt(Obj.nextLine());

        System.out.print( "What is the width of the room in feet? ");
        int width = Integer.parseInt(Obj.nextLine());

        int areaFeet = legnth * width;
        double areaMeters = areaFeet * conversion;

        System.out.println("You entered dimensions of "+legnth+" feet by "+width+" feet.");
        System.out.println("The area is");
        System.out.println(areaFeet+" square feet");
        System.out.printf("%.3f square meters", areaMeters);
    }
}