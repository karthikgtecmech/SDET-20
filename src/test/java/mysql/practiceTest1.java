package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class practiceTest1 {

	public static void main(String[] args) throws Throwable {
		//register driver
		Driver driver = new Driver();
		//establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root" , "root");
		//issue statement
		Statement statement = connection.createStatement();
		//execute update
		ResultSet result = statement.executeQuery("select * from student_info");
		
		while(result.next()) {
			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		connection.close();

	}

}
