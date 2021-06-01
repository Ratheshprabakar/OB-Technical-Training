import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Rathesh Prabakar
 *
 */
public class JDBCSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				Connection con = null;
				Statement stmt = null;	
				ResultSet rs = null;			
					try {
						
						//Step 1
						Class.forName("com.mysql.jdbc.Driver");
						
						//Step 2 Establish the connection with the database with user and password
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
						
						// Step 3 Issuing Query
						String query = "select * from student";
						
						// Step 4 : Execute and process the query
						stmt = con.createStatement();
						 rs = stmt.executeQuery(query);
						 while(rs.next()) {
							 int studentId = rs.getInt("sid");
							 String studentName = rs.getString("sname");
							 int studentMark = rs.getInt("marks");
							 System.out.println("Student Id "+ studentId+"\nStudent Name "+ studentName+"\nStudent Mark "+studentMark);
							 System.out.println();
						 }

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					//Step 5 : Close all the objects
					finally {
						try {
							if(con!=null)
								con.close();
							if(stmt!= null)
								stmt.close();
							if(rs!=null)
								rs.close();
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
					

	}

}
