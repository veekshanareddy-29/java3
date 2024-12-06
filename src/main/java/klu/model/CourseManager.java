package klu.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CourseManager {
	
	public String saveCourse(Courses C)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd17","root","29@Veekshana");
		PreparedStatement ps = con.prepareStatement("insert into courses values(?,?,?)");
		ps.setString(1, C.getCoursecode());
		ps.setString(2, C.getCourseTitle());
		ps.setDouble(3, C.getCredits());
		ps.execute();
		return C.toString();
	}
}
