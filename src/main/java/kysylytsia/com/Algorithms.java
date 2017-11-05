package kysylytsia.com;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class Algorithms {

    // bubble sort
    public static int[] bubleSort (int []array) {
        int x = 0; // проміжна змінна, для обміну.
        for (int i = 0; i < array.length - 1; i++) { // for що пробігає по всьому масиві
            for (int j = 0; j < array.length - 1 - i; j++) { // for що пробігає по всьому масиві -i для оптимізації, (не потрібно провіряти уже відсортоване).
                if (array[j] > array[j + 1]) {  // Порівнюємо  [ітий] з [i+1]. Якщо слідуючий менший, то міняємо місцями.
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
        return array;
    }


    //selection sort
    public static int[] selectionSort (int []array) {
        int minIndex = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) { // for що пробігає по всьому масиві

            min = array[i]; //Призначаємо мін елементом 1 знач в масиві
            minIndex = i; //Запамятовуємо index елемента

            for (int j = i + 1; j < array.length; j++) { //for що пробігає по невідсортованому діапазоні

                if (min > array[j]) { // Шукаємо мінімальне число та index в масиві.
                    min = array[j]; //Запамятовуємо мінімальне число на данному етапі
                    minIndex = j; // Запам'ятовуємо index мінімального числа в масиві.
                }
            }

            array[minIndex] = array[i]; //Міняємо місцями min з [ітим] елементом масива
            array[i] = min; // В [ітий] елемент записуємо min значення

        }
        return array;
    }







}
