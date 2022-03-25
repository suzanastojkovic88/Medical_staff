package medical_staff.adapter;

public class StaffCard {

	public String staffCard(Staff staff) {

		String card = "";
		card += staff.getName();
		card += "\n" + staff.getVocation();
		card += "\n" + staff.getAddress();
		return card;
	}
}