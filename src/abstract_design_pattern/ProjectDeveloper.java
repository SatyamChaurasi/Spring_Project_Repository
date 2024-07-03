package abstract_design_pattern;

public class ProjectDeveloper implements Employee {

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("This is manager");
		return "Project Manager";
	}

}
