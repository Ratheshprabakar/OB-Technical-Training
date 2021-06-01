import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Rathesh Prabakar
 *
 */
public class JDBCInsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;		
		
			try {
				
				//Step 1
				Class.forName("com.mysql.jdbc.Driver");
				
				//Step 2 Establish the connection with the database with user and password
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
				
				// Step 3 Issuing Query
				String query = "insert into student values(5,'Kishore',76)";
				
				// Step 4 : Execute and process the query
				stmt = con.createStatement();
				int count = stmt.executeUpdate(query);
				System.out.println("Inserted record"+ count);

			} catch (Exception e) {
				e.printStackTrace();
			}	
			//Step 5 : Close all the objects
			finally {
				try {
					if(con!=null)
						con.close();
					if(stmt!= null)
						stmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			

	}

}
