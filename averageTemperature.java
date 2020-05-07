// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: May 7, 2020
// Average temperature over any number of days

import java.util.Scanner;

public class averageTemperature{
    
    public static void main(String[] args) 
    {
        int n, sum = 0;
        int m, average = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days you would like the average of: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the temperature over the past day(s):");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
            average = sum/n;
        }
        System.out.println("The average over the past days was: "+average);
    }
}