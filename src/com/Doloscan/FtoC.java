package com.Doloscan;


import java.util.Scanner;

public class FtoC {


    static float tempFC() {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:  ");
        float tempFahrenheit = scr.nextFloat();

        float tempCelsius = (5 * (tempFahrenheit - 32)) / 9;
        System.out.println("Temperature in Celsius is: " + tempCelsius);
        return tempCelsius;
    }

}
