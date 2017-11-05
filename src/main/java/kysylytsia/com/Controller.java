package kysylytsia.com;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class Controller {

    /**
     * this static method returns an array of specified lengths. in the range from min to max
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
     * @param array
     */
    public static void displayArray(int[] array) {

        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }

}
