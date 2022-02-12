package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDao {
	//query
	private static final String insertQuery = "INSERT INTO employee(first_name, last_name, email, gender,dob, phone, address)"
			+ "values (?,?,?,?,?,?,?)";
	private static final String selectQuery = "SELECT * FROM employee WHERE id=?";
	private static final String selectAll = "SELECT * FROM employee";
	private static final String deleteQuery = "DELETE FROM employee WHERE id=?";
	private static final String updateQuery = "UPDATE employee SET first_name=?, last_name=?, email=?, gender=?, dob=?, phone=?, address=?  where id=?";
		
		
		//Connection statement
		Connection conn = null;
		private static PreparedStatement ps;
		private  static ResultSet rs;
		
		
		//class connect DB
		public EmployeeDao(Connection conn) {
			this.conn = conn;
		}
		
		//insert new employee
		public void addEmp(Employee emp) {
			try {
				ps=this.conn.prepareStatement(insertQuery);
				ps.setString(1, emp.getFirstName());
				ps.setString(2, emp.getLastName());
				ps.setString(3, emp.getEmail());
				ps.setString(4, emp.getGender());
				ps.setString(5, emp.getDob());
				ps.setString(6, emp.getPhone());
				ps.setString(7, emp.getAddress());
				
				ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//getAllEmp
		public List<Employee> getAllEmp(){
			List<Employee> emp = new ArrayList<>();
			try {
				ps=this.conn.prepareStatement(selectAll);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					//create attribute in object by set column
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String gender = rs.getString("gender");
					String dob	= rs.getString("dob");
					String phone = rs.getString("phone");
					String add = rs.getString("address");
					
					emp.add(new Employee(id, fname, lname, email, gender, dob, phone, add));
					
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return emp;
		}
		
		
		//delete Emp
		public boolean deleteEmp(int id) {
			boolean result = false;
			try {
				ps = this.conn.prepareStatement(deleteQuery);
				ps.setInt(1, id);
				ps.executeUpdate();
				result = true;
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		
		
		//update Emp
		public boolean updateEmp(Employee emp) {
			boolean result = false;
			try {
				ps = this.conn.prepareStatement(updateQuery);
				
				ps.setString(1, emp.getFirstName());
				ps.setString(2, emp.getLastName());
				ps.setString(3, emp.getEmail());
				ps.setString(4, emp.getGender());
				ps.setString(5, emp.getDob());
				ps.setString(6, emp.getPhone());
				ps.setString(7, emp.getAddress());
				ps.setInt(8, emp.getId());
				
				ps.executeUpdate();
				result = true;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		
		//getById
		public Employee selectById(int id) {
			Employee emp = null;
			try {
				ps = this.conn.prepareStatement(selectQuery);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String gender = rs.getString("gender");
					String dob = rs.getString("dob");
					String phone = rs.getString("phone");
					String add = rs.getString("address");
					
					emp = new Employee(id,fname, lname, email, gender, dob, phone, add);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return emp;
		}
}
