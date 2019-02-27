package andreipkg;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private Employee manager;
	private Employee[] subordinates = new Employee[0];

	public Employee(String name, int age, int salary, Employee manager) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.manager = manager;
	}

//	public void show() {
//		System.out.println(name + " " + age + " " + salary + " " + //
//				(manager != null ? manager.name : "--"));
//	}

	public String getName() {
		return name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public boolean isManager() {
		return manager == null;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void display(String prefix) {
		System.out.println(prefix + name);
		for (Employee emp : subordinates) {
			emp.display(prefix + "  ");
		}
	}

	public void setSubordinates(Employee[] subordinates) {
		this.subordinates = subordinates;
		for (Employee emp : subordinates) {
			emp.setManager(this);
		}
	}
}