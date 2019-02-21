import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John",32,2500,new Person("Mike")));
        employeeList.add(new Employee("Michael",28,4050,new Person("Mike")));
        employeeList.add(new Employee("Mike",50,6000,new Person("")));
        employeeList.add(new Employee("Rob",45,3250,new Person("Mike")));
        employeeList.add(new Employee("Tyrone",25,2800,new Person("Mike")));

        System.out.println("The biggest salary is earned by: " + employeeClient.rich(employeeList));
        System.out.println("The smallest salary is earned by " + employeeClient.poor(employeeList));
        System.out.println("Salariul mediu: " + employeeClient.salarMediu(employeeList));
        System.out.println("Varsta medie: " + employeeClient.mediumAge(employeeList));
        System.out.println("Cel mai tanar angajat este: " + employeeClient.young(employeeList));
        System.out.println("GM este: " + employeeClient.generalManager(employeeList));
        System.out.println("\n");
        employeeClient.ierarhie(employeeList);
    }
}

