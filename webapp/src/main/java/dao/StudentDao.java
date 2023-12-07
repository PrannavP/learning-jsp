package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

import modal.Student;

public class StudentDao {
	public boolean saveStudent(Student s){
		boolean status = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_db", "root", "");
			
			String sql = "INSERT INTO student_table (name, address, hobby, age) VALUE(?,?,?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getAddress());
			ps.setString(3, s.getHobby());
			ps.setInt(4, s.getAge());
			
			int i = ps.executeUpdate();
			if(i==1) {
				status = true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				System.out.println("Exception occured: " + e);
			}
		}
		return status;
	}
}