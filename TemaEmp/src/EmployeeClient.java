import java.util.*;

public class EmployeeClient {


    public String rich(List<Employee> arrayList){
        arrayList.sort(Comparator.comparing(Employee::getSalary).reversed());
        return arrayList.get(0).getName();
    }

    public String poor(List<Employee> arrayList) {
        arrayList.sort(Comparator.comparing(Employee::getSalary));
        return arrayList.get(0).getName();
    }

    public int salarMediu(List<Employee> arrayList){
        int sum = 0;

        for(Employee employee:arrayList){
            sum = sum + employee.getSalary();
        }

        return sum/arrayList.size();
    }

    public int mediumAge(List<Employee> arrayList){
        int sum = 0;
        for(Employee employee:arrayList){
            sum = sum + employee.getAge();
        }
        return sum/arrayList.size();
    }

    public String young(List<Employee> arrayList) {
        arrayList.sort(Comparator.comparing(Employee::getAge));
        return arrayList.get(0).getName();
    }

    public String generalManager(List<Employee> arrayList){
        for(Employee employee:arrayList){
            if(employee.getManager().getName().equals("")){
                return employee.getName();
            }
        }
        return "No manager";
    }

    public void ierarhie(List<Employee> arrayList) {

        for (Employee employee : arrayList) {
            if (employee.getManager().getName().equals("")) {
                System.out.println(employee.getName());
            }
        }

        for (Employee employee : arrayList){
            if(employee.getManager().getName()!=("")){
                System.out.println("    " + employee.getName());
            }
        }
    }

}


