package com.kysylytsia;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        // fill an array with random numbers
        int[] array = Controller.generationArray(10, -10, 20);

        // show array
        Controller.displayArray(array);

        System.out.println();
        System.out.println("Max Value: " + Controller.maxValue(array));
        System.out.println("Min Value: " + Controller.minValue(array));

        System.out.println();
        System.out.println("Sum of positive numbers: " + Controller.sumPositiveNumbers(array));
        System.out.println("Sum of negative numbers: " + Controller.sumNegativeNumbers(array));

        System.out.println();
        System.out.println("Amount of positive: " + Controller.amountPositive(array));
        System.out.println("Amount of negative: " + Controller.amountNegative(array));

        System.out.println();
        System.out.println(Controller.comparisonOfValues(array));

    }
}
