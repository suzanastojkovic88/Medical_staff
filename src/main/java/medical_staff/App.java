package medical_staff;

import medical_staff.adapter.Employee;
import medical_staff.adapter.EmployeeAdapter;
import medical_staff.adapter.StaffCard;

public class App {
	
	public static void main(String[] args) {

		EmployeeAdapter adapter  = new EmployeeAdapter();
		employeeData(adapter);
		StaffCard staff = new StaffCard();
		String card  = staff.staffCard(adapter);
		System.out.println(card);
		
		Employee employee = new Employee();
		employeeData(employee);
	}

	private static void employeeData(Employee employee) {
		employee.setFirstName("Milica");
		employee.setLastName("Nikolic");
		employee.setJobTitle("nurse");
		employee.setHospitalLocation("Hajduk Veljkova, Novi Sad");
	}

}
