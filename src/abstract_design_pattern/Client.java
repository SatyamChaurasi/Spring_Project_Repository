package abstract_design_pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		String name = employee1.name();
		System.out.println(name);
		
		Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
		String name2 = employee2.name();
		System.out.println(name2);
		
		Employee employee3 = EmployeeFactory.getEmployee(new ProjDevFacotry());
		String name3 = employee3.name();
		System.out.println(name3);
	}

}
