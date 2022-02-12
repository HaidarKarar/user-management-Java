package model;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private String dob;
	private String city;
	private String gender;
	
	
	public User() {
		super();
	}


	public User(int id, String name, String email, String mobile, String dob, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.gender = gender;
	}
	
	
	public User(String name, String email, String password, String mobile, String dob, String city,
			String gender) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", dob=" + dob + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
}
