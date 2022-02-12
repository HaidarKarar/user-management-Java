package dao;

import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.DBConn;

public class UserDao {
	//query
	private static final String insertQuery = "INSERT INTO user(name, email, password, mobile, dob, city, gender)"
					+ "Values(?,?,?,?,?,?,?)";
	private static final String selectAllQuery = "SELECT * FROM user";
	private static final String selectIdQuery = "SELECT * FROM user WHERE id=?";
	private static final String updateQuery = "UPDATE users SET name=?, emai=?, mobile=?, dob=?, city=?, gender=?";
	private static final String deleteQuery = "DELETE FROM WHERE id=?";
	private static final String loginQuery = "SELECT * FROM user WHERE email=? AND password=?";
	
	
	//Connection statement
	Connection conn = null;
	private static PreparedStatement ps;
	private  static ResultSet rs;
	
	
	//class connect DB
	public UserDao(Connection conn) {
		this.conn = conn;
	}
	
	
	//insert new user
	public void insertUser(User user) {
		
		try {
			ps = this.conn.prepareStatement(insertQuery);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getMobile());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getCity());
			ps.setString(7, user.getGender());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	//login user
	public User loginUser(String email, String password) {
		User u = null;
		try {
			ps = this.conn.prepareStatement(loginQuery);
			ps.setString(1, email);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				u = new User();
				u.setName(rs.getString("name")); //set attribute for object by get data in row of table
				u.setEmail(rs.getString("email"));
				u.setDob(rs.getString("dob"));
				u.setDob(rs.getString("password"));
				u.setMobile(rs.getString("mobile"));
				u.setCity(rs.getString("city"));
				u.setGender(rs.getString("gender"));
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	
	
	//
}
