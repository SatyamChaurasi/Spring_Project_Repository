package abstract_design_pattern;

public class ProjDevFacotry extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new ProjectDeveloper();
	}

}
