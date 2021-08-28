package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class practiceInsertRowTest {

	public static void main(String[] args) throws Throwable {
		
		Driver driver = new Driver();
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainee", "root" , "root");
		Statement statement = connection.createStatement();
		for(int i=1;i<=50;i++) {
		int result = statement.executeUpdate("insert into test_yantra (regno, firstName, middleName, lastName) values('"+i+"', 'Karthik','D', 'TYSS');");
		if(result==1) {
			System.out.println("Pass::Data added");
		}else {
			System.out.println("Fail::Data not added");
		}
		}
		connection.close();
	}

}
