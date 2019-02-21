public class Employee  {

    private String name;
    private int age;
    private int salary;
    private Person manager;

    public Employee(String name, int age, int salary, Person manager) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Person getManager() {
        return manager;
    }

    public void show(){

        System.out.println(name + " " + "is " + age + " years old. " + "He is earning " + salary + " and his manager is " + manager);

    }


}
