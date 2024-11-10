package Database;
import java.sql.Connection;
import java.sql.DriverManager;
//import
public class DBConnection {
	static Connection con=null;
	String url="jdbc:mysql://localhost:3306/bankproject";
	String userName="root";
	String passWord="Ajay10#kannan.";
	
	public Connection getConnection() {
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url,userName,passWord);
				System.out.println("Connection established successfully");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void main(String[] args) {
		DBConnection connect=new DBConnection();
		Connection con=connect.getConnection();
	}
}
