import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;

/**
 * @author Rathesh Prabakar
 *
 */
public class DynamicSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;	
		ResultSet rs = null;			
			try {
				
				//Step 1
				Class.forName("com.mysql.jdbc.Driver");
				
				//Step 2 Establish the connection with the database with user and password
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
				
				// Step 3 Issuing Query
				String query = "select * from student where sid = ?";
				
				// Step 4 : Execute and process the query
				pstmt = con.prepareStatement(query);
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the Student ID\t");
				int s_id = input.nextInt();
				
				pstmt.setInt(1, s_id);
				rs = pstmt.executeQuery();
				
				 if(rs.next()) {
					 int studentId = rs.getInt("sid");
					 String studentName = rs.getString("sname");
					 int studentMark = rs.getInt("marks");
					 System.out.println("Student Id "+ studentId+"\nStudent Name "+ studentName+"\nStudent Mark "+studentMark);
					 System.out.println();
				 }
				 else {
					 System.out.println("No record found");
				 }
					input.close();


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			//Step 5 : Close all the objects
			finally {
				try {
					if(con!=null)
						con.close();
					if(pstmt!= null)
						pstmt.close();
					if(rs!=null)
						rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

	}

}
