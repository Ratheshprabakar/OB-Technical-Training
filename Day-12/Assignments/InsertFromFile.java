import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 
 */

/**
 * @author Rathesh Prabakar
 *
 */
public class InsertFromFile {

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
			pstmt = con.prepareStatement(query);
			String filePath = "/home/rathesh/Desktop/input.txt";
			BufferedReader input = new BufferedReader(new FileReader(filePath));
			String[] fileData = null;
			String lineData = null;
			while((lineData = input.readLine()) != null) {
				fileData = lineData.split(",");
			}
			// Step 4 : Execute and process the query
			pstmt.setInt(1, Integer.parseInt(fileData[0]));
			pstmt.setString(2, fileData[1]);
			pstmt.setInt(3, Integer.parseInt(fileData[2]));

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
