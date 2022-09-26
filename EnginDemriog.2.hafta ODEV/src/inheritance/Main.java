package inheritance;

public class Main {

	public static void main(String[] args) {
			
			Employee employee=new Employee();
			Customer customer=new Customer();
			
			EmployeeManager employeeManager=new EmployeeManager();
			employeeManager.List();
			employeeManager.BestEmployee();
			employeeManager.Add();
			
			CustomerManager customerManager=new CustomerManager();
			customerManager.Add();
			
			PersonManager cusManager=new CustomerManager();		// böylede olur.
			
			CustomerManager aaa=(CustomerManager) new PersonManager();		// cating yapabiliyomusuz.
			
			
		
	}

}
