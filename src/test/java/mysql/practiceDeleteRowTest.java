package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class practiceDeleteRowTest {

		public static void main(String[] args) throws Throwable {
			
			Driver driver = new Driver();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root" , "root");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("delete from student_info where regno='4';");
			if(result==1) {
				System.out.println("Pass::Data deleted");
			}else {
				System.out.println("Fail::Data not deleted");
			}
			connection.close();

	}

}
