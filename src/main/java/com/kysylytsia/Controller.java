package com.kysylytsia;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class Controller {

    /**
     * this static method returns an array of specified lengths. in the range from min to max
     *
     * @param arrayLength
     * @param min
     * @param max
     * @return
     */
    public static int[] generationArray(int arrayLength, int min, int max) {

        int array[] = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
        return array;
    }



    /**
     * this method show array in console
     *
     * @param array
     */
    public static void displayArray(int[] array) {

        for (int temp : array) {
            System.out.print(temp + " ");
        }

    }


    /**
     * this method return max value in array
     *
     * @param array
     * @return
     */
    public static int maxValue(int array[]) {

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }


    /**
     * this method return min value in array
     *
     * @param array
     * @return
     */
    public static int minValue(int array[]) {

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }

        return minValue;
    }


    /**
     * this method return sum of positive numbers.
     * 0 isn't positive number in mathematic!
     *
     * @param array
     * @return
     */
    public static int sumPositiveNumbers(int[] array) {
        int sum = 0;
        for (int temp : array) {

            if (temp > 0) {
                sum += temp;
            }
        }
        return sum;
    }


    /**
     * this method return sum of negative numbers.
     * 0 isn't positive number in mathematic!
     *
     * @param array
     * @return
     */
    public static int sumNegativeNumbers(int[] array) {
        int sum = 0;
        for (int temp : array) {

            if (temp < 0) {
                sum += temp;
            }
        }
        return sum;
    }


    /**
     * this method return amount of positive numbers.
     * 0 isn't positive number in mathematic!
     *
     * @param array
     * @return
     */
    public static int amountPositive(int array[]) {

        int countPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            }
        }
        return countPositive;

    }




    /**
     * this method return amount of negative numbers.
     * 0 isn't positive number in mathematic!
     *
     * @param array
     * @return
     */
    public static int amountNegative(int array[]) {

        int countNegativ = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegativ++;
            }
        }
        return countNegativ;
    }


    /**
     * this method return What values are more.
     * @param array
     * @return
     */
    public static String comparisonOfValues (int []array){

        int countNegativ = 0;
        int countPositive = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] > 0){
                countPositive++;
            } else {
                countNegativ++;
            }
        }

        if (countPositive == countNegativ){
            return "Positive and Negativ values equally!";
        } else if (countPositive > countNegativ){
            return "Positive values more!";
        } else {
            return "Negative values more!";
        }
    }
}
