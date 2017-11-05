package kysylytsia.com;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class App 
{
    public static void main( String[] args ) {

        int []array = Controller.generationArray(25, -25, 45);

        System.out.println("Initial array: ");
        Controller.displayArray(array);

        System.out.println();
        System.out.println();

        System.out.println("Bubble sort: " );
        Controller.displayArray( Algorithms.bubleSort(array) );

        System.out.println();
        System.out.println();

        System.out.println("Selection sort: " );
        Controller.displayArray( Algorithms.selectionSort(array) );
    }

}