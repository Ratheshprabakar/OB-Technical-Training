import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rathesh Prabakar
 *
 */
public class DynamicInsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int count = 0;

		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 Establish the connection with the database with user and password
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false", "root",
					"Onebill@2020");

			// Step 3 Issuing Query
			String query = "insert into student values (?,?,?)";

			// Step 4 : Execute and process the query
			pstmt = con.prepareStatement(query);
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Student ID\t");
			int s_id = input.nextInt();

			System.out.println("\nEnter the Student Name\t");
			String s_name = input.next();

			System.out.println("\nEnter the Student Mark\t");
			int s_mark = input.nextInt();

			pstmt.setInt(1, s_id);
			pstmt.setString(2, s_name);
			pstmt.setInt(3, s_mark);

			count = pstmt.executeUpdate();
			if (count != 0)
				System.out.println("Inserted Successfully");
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
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
