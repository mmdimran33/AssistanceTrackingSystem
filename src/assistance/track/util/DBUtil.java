/*Author by Mohammad Imran Chaudhary 02/02/2018 This is for Data base Connectivity*/
package assistance.track.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
public static Connection conn = null;
public static Connection  getConnection(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assistancetracksystem", "root", "mysqldb");
		if(conn != null){
			System.out.println("Connection Sucess!!!!!!!!!!!!!");
		}else{
			System.out.println("Connection Failure!!!!!!!!!!!!!");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
}
}
