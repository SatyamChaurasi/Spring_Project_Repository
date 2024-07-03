package abstract_design_pattern;

public class WebDeveloper implements Employee{

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 40000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("This is a Web Developer");
		return "Web Developer";
	}

}
