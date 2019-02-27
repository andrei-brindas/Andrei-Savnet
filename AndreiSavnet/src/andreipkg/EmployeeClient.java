package andreipkg;

public class EmployeeClient {

	private void doAction() {
		Employee emp1 = new Employee("Mike", 48, 6000, null);
		Employee emp2 = new Employee("John", 35, 5000, null);
		Employee emp3 = new Employee("Michael", 33, 4000, null);
		Employee emp4 = new Employee("Bob", 32, 3000, null);
		Employee emp5 = new Employee("Vanessa", 29, 2000, null);
		Employee emp6 = new Employee("Michelle", 22, 1000, null);

		emp1.setSubordinates(new Employee[] { emp2, emp5 });
		emp2.setSubordinates(new Employee[] { emp3 });
		emp4.setSubordinates(new Employee[] { emp4 });
		emp5.setSubordinates(new Employee[] { emp6 });

		Employee[] emp = { emp1, emp2, emp3, emp4, emp5, emp6 };

		System.out.println("The biggest salary: " + getMaxSal(emp));
		System.out.println("The smallest salary: " + getMinSal(emp));
		System.out.println("Avg salary: " + getAvgSalary(emp));
		System.out.println("Avg Age: " + getAvgAge(emp));
		System.out.println("The youngest is: " + getYoungest(emp));
		Employee manager = findManager(emp);
		System.out.println("GM is: " + manager.getName());

		manager.display("");

	}

	private Employee findManager(Employee[] employees) {
		for (Employee emp : employees) {
			if (emp.isManager()) {
				return emp;
			}
		}
		return null;
	}

	private String getMinSal(Employee[] emp) {

		int min = emp[0].getSalary();
		String name = emp[0].getName();
		for (int i = 1; i < emp.length; i++) {
			if (emp[i].getSalary() < min) {
				name = emp[i].getName();
			}
		}
		return name;
	}

	private String getMaxSal(Employee[] emp) {

		int max = emp[0].getSalary();
		String name = emp[0].getName();

		for (int i = 1; i < emp.length; i++) {
			if (emp[i].getSalary() >= max) {
				name = emp[i].getName();
			}
		}
		return name;
	}

	public static int getAvgSalary(Employee[] emp) {
		int sum = 0;
		for (Employee sal : emp) {
			sum = sum + sal.getSalary();
		}

		return sum / emp.length;
	}

	public static int getAvgAge(Employee[] emp) {
		int sum = 0;
		for (Employee sal : emp) {
			sum = sum + sal.getAge();
		}

		return sum / emp.length;
	}

	private String getYoungest(Employee[] emp) {

		int min = emp[0].getAge();
		String name = emp[0].getName();
		for (int i = 1; i < emp.length; i++) {
			if (emp[i].getAge() < min) {
				name = emp[i].getName();
			}
		}
		return name;
	}

	public static void main(String[] args) {
		EmployeeClient employeeClient = new EmployeeClient();
		employeeClient.doAction();
	}

}
