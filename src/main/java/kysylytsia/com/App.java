package kysylytsia.com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SERAFIM on 05.11.2017.
 */
enum Department {
    DEVELOPMENT, MARKETING, SALES, SUPPORT
}

public class App {

    public static void main( String[] args ) {

        Employee employee1 = new Employee("Andrii", Department.DEVELOPMENT, 1700);
        Employee employee2 = new Employee("Roman", Department.DEVELOPMENT, 2000);
        Employee employee3 = new Employee("Oleg", Department.SUPPORT, 1500);
        Employee employee4 = new Employee("Oksana", Department.SALES, 1200);
        Employee employee5 = new Employee("Irina", Department.MARKETING, 800);

        Employee[] arraysEmployee = new Employee[5];

        arraysEmployee[0] = employee1;
        arraysEmployee[1] = employee2;
        arraysEmployee[2] = employee3;
        arraysEmployee[3] = employee4;
        arraysEmployee[4] = employee5;


        //input from keyboard.
        System.out.println("Input name of department");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toUpperCase();
        Department department = Department.valueOf(str);

        for (int i=0; i<arraysEmployee.length; i++){
            if(arraysEmployee[i].getDepartmentName().equals(department) ){
                System.out.print(arraysEmployee[i].getName() + " ");
            }
        }


        System.out.println();
        System.out.println();
        Arrays.sort(arraysEmployee);

        for (Employee e: arraysEmployee) {
            System.out.println("Employee: " + e.getName() + ",  salary: " + e.getSalary());
        }





    }





}
