package kysylytsia.com;

import java.util.Scanner;

/**
 * Created by SERAFIM on 05.11.2017.
 */

enum Country {
    UKRAINE("Eurasia"), POLAND("Eurasia"), FRANCE("Eurasia"), GERMANIA("Eurasia"),
    ITALY("Eurasia"), SPAIN("Eurasia"),  ENGLAND("Eurasia"), CHINA("Eurasia"),
    JAPAN("Eurasia"), IRAN("Eurasia"), PAKISTAN("Eurasia"), INDIA("Eurasia"),
    KOREYA("Eurasia"), RUSSIA("Eurasia"), TYRKEY("Eurasia"), KAZAKHSTAN("Eurasia"),
    CANADA("North america"),MEXICO("North america"), AMERICA("North america"),
    BRAZIL("South america"), CHILY("South america"), Argentina("South america"),
    ALGERIA("Africa"), LIBYA("Africa"), EGYPT("Africa"), KONGO("Africa"),
    UAR("Africa"), SUDAN("Africa"), AUSTRALIA("Australia"), ANTARCTICA("Antarctica");

    private String contenent;

    Country( String contenent){
        this.contenent = contenent;
    }

    public String getContenent(){
        return contenent;
    }
}

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input country please: ");

        String str = scanner.nextLine();
        str = str.toUpperCase();
        Country country = Country.valueOf(str);

        if (country != null){
            System.out.println("Contenent: " + country.getContenent() );
        } else {
            System.out.println("Sorry, but the continent is not found!");
        }
    }
}
