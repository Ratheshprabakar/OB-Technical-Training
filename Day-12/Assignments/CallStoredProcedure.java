import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rathesh Prabakar
 *
 */
public class CallStoredProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement cstmt = null;
		int count = 0;

		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 Establish the connection with the database with user and password
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/training?autoReconnect=true&useSSL=false", "root",
					"Onebill@2020");

			// Step 3 Issuing Query
			String query = "call getordercount(?,?);";

			// Step 4 : Execute and process the query
			cstmt = con.prepareCall(query);
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the status you want to find the count(In Progress/shipped)");
			String inputStatus = input.nextLine();
			
			cstmt.setString(1, inputStatus);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			count = cstmt.executeUpdate();
			int recordCount = cstmt.getInt(2);
			
			System.out.println("There are " + recordCount+ " records found for "+ inputStatus);
			
			if (count != 0)
				System.out.println("Stored Procedure Called Successfully");
			else
				System.out.println("Error");
			
			input.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 5 : Close all the objects
		finally {
			try {
				if (con != null)
					con.close();
				if (cstmt != null)
					cstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
