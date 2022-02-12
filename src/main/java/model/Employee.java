package model;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String dob;
	private String address;
	private String phone;
	
	

	public Employee(int id, String firstName, String lastName, String email, String gender, String dob, String address,
			String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
	}
	
	public Employee( String firstName, String lastName, String email, String gender, String dob, String address,
			String phone) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
