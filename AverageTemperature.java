// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: May 7, 2020
// Average temperature over any number of days

import java.util.Scanner;

public class AverageTemperature{
    
    public static void main(String[] args) 
    {
        int sum = 0;
        int theIntegerTheUserEnters = 0;
        int average = 0;
        
        Scanner stringThatUserEnters = new Scanner(System.in);
        System.out.print("Enter the number of days you would like the average of: ");
        theIntegerTheUserEnters = stringThatUserEnters.nextInt();
        int temperatures[] = new int[theIntegerTheUserEnters];
        System.out.println("Enter the temperature over the past day(stringThatUserEnters):");
        
        for (int counter = 0; counter < theIntegerTheUserEnters; counter++) {
            temperatures[counter] = stringThatUserEnters.nextInt();
            sum = sum + temperatures[counter];
        }
        
        average = sum / theIntegerTheUserEnters;
        System.out.println("The average over the past days was: " + average);
    }
}
