package kysylytsia.com;

/**
 * Created by SERAFIM on 05.11.2017.
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private Enum departmentName;
    private int salary;

    public Employee() {}

    public Employee(String name, Enum departmentName, int salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSlary(int slary) {
        this.salary = slary;
    }


    @Override
    public int compareTo(Employee emp) {
        return this.salary - emp.getSalary();
    }
}
