package kysylytsia.com;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class App {
    public static void main( String[] args ) {

        int [][]arrays = {{1,8}, {4,6,8,2}, {1,4,3}, {12, 5, 6, 17, 7, 2}, {1,3,13} };

        for (int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){

                System.out.print(arrays[i][j] + " ");

            }
            System.out.println();
        }
    }
}
