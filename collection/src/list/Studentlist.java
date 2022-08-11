package list;

import java.util.LinkedList;
import java.util.List;

public class Studentlist {

	private String name;
	private String department;
	private int year;
	private int mobileno;
	
	Studentlist() {
		setName("raj");
		setDepartment("mech");
		setYear(3);
		setMobileno(987654321);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the mobileno
	 */
	public int getMobileno() {
		return mobileno;
	}

	/**
	 * @param mobileno the mobileno to set
	 */
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	

	public static void main(String[] args) {

		Studentlist detail = new Studentlist();

		String studna = detail.getName();
		int studno = detail.getMobileno();
		String studdep = detail.getDepartment();
		int studyear = detail.getYear();

		List<Object> name = new LinkedList<Object>();
		name.add(studna);
		name.add(studno);
		name.add(studdep);
		name.add(studyear);

		for (Object obj : name) {
			System.out.println(obj);
		}

	}

}
