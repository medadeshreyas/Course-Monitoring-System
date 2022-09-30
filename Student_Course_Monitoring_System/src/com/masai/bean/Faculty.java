/**
 * 
 */
package com.masai.bean;

/**
 
 *
 */
public class Faculty {

	/**
	 * @param args
	 */

	private int faculty_Id;
	private String faculty_Name;
	private String faculty_Address;
	private String faculty_Mobile;
	private String faculty_Email;
	private String faculty_User;
	private String faculty_Password;

	public Faculty(int faculty_Id, String faculty_Name, String faculty_Address, String faculty_Mobile,
			String faculty_Email, String faculty_User, String faculty_Password) {
		super();
		this.faculty_Id = faculty_Id;
		this.faculty_Name = faculty_Name;
		this.faculty_Address = faculty_Address;
		this.faculty_Mobile = faculty_Mobile;
		this.faculty_Email = faculty_Email;
		this.faculty_User = faculty_User;
		this.faculty_Password = faculty_Password;
	}

	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Faculty [faculty_Id=" + faculty_Id + ", faculty_Name=" + faculty_Name + ", faculty_Address="
				+ faculty_Address + ", faculty_Mobile=" + faculty_Mobile + ", faculty_Email=" + faculty_Email
				+ ", faculty_User=" + faculty_User + ", faculty_Password=" + faculty_Password + "]";
	}

	/**
	 * @return the faculty_Id
	 */
	public int getFaculty_Id() {
		return faculty_Id;
	}

	/**
	 * @param faculty_Id the faculty_Id to set
	 */
	public void setFaculty_Id(int faculty_Id) {
		this.faculty_Id = faculty_Id;
	}

	/**
	 * @return the faculty_Name
	 */
	public String getFaculty_Name() {
		return faculty_Name;
	}

	/**
	 * @param faculty_Name the faculty_Name to set
	 */
	public void setFaculty_Name(String faculty_Name) {
		this.faculty_Name = faculty_Name;
	}

	/**
	 * @return the faculty_Address
	 */
	public String getFaculty_Address() {
		return faculty_Address;
	}

	/**
	 * @param faculty_Address the faculty_Address to set
	 */
	public void setFaculty_Address(String faculty_Address) {
		this.faculty_Address = faculty_Address;
	}

	/**
	 * @return the faculty_Mobile
	 */
	public String getFaculty_Mobile() {
		return faculty_Mobile;
	}

	/**
	 * @param faculty_Mobile the faculty_Mobile to set
	 */
	public void setFaculty_Mobile(String faculty_Mobile) {
		this.faculty_Mobile = faculty_Mobile;
	}

	/**
	 * @return the faculty_Email
	 */
	public String getFaculty_Email() {
		return faculty_Email;
	}

	/**
	 * @param faculty_Email the faculty_Email to set
	 */
	public void setFaculty_Email(String faculty_Email) {
		this.faculty_Email = faculty_Email;
	}

	/**
	 * @return the faculty_User
	 */
	public String getFaculty_User() {
		return faculty_User;
	}

	/**
	 * @param faculty_User the faculty_User to set
	 */
	public void setFaculty_User(String faculty_User) {
		this.faculty_User = faculty_User;
	}

	/**
	 * @return the faculty_Password
	 */
	public String getFaculty_Password() {
		return faculty_Password;
	}

	/**
	 * @param faculty_Password the faculty_Password to set
	 */
	public void setFaculty_Password(String faculty_Password) {
		this.faculty_Password = faculty_Password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
