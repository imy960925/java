package test27;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon2 {
private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
private static final String id = "system";
private static final String pwd = "12345678";
private static final String driver = "oracle.jdbc.driver.OracleDriver";
private static Connection con;

private static void open() {
	try {
		Class.forName(driver);
		DBCon.con = DriverManager.getConnection(url, id, pwd);
		con.createStatement().executeQuery("select * from member");
		System.out.println("접속완료");
	} catch 
	
}
}
