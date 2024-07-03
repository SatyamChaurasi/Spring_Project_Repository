package abstract_design_pattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am a android developer.");
		return "Android Developer";
	}

}
