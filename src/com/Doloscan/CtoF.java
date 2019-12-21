package com.Doloscan;

import java.util.Scanner;

public class CtoF {


    static float tempCF() {

        Scanner scr = new Scanner(System.in);
        System.out.print("\nEnter temperature in Celsius: ");
        float tempCelsius = scr.nextFloat();

        float tempFahrenheit = (9 * tempCelsius + (32 * 5)) / 5;
        System.out.println("Temperature in Fahrenheit is: " + tempFahrenheit);
        return tempFahrenheit;
    }
}
