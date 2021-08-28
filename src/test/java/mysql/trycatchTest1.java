package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class trycatchTest1 {

		public static void main(String[] args) throws Throwable {
			Connection connection=null;
			try {
					//register driver
					Driver driver = new Driver();
					
					//establish connection
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root" , "root");
					//issue statement
					Statement statement = connection.createStatement();
					//executeUpdate
					int result = statement.executeUpdate("insert into student_info values('4' , 'karthik' , 'D' , 'hii')");
					
					if(result==1) {
						System.out.println("Pass::Data added");
					}else {
						System.out.println("Fail::Data not added");
					}

				}
			catch(Exception e){
			}
			finally {
				//close connection
				connection.close();

			}
			

		}


	}


