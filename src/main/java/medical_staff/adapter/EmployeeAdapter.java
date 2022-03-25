package medical_staff.adapter;

public class EmployeeAdapter extends Employee implements Staff {

	public String getName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	public String getVocation() {
		return this.getJobTitle();
	}

	public String getAddress() {
		return this.getHospitalLocation();
	}

}
