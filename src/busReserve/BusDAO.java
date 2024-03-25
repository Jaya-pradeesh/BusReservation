package busReserve;

import java.sql.*;

public class BusDAO {
	public void displayBusInfo() throws SQLException {
		String query = "select * from bus";
		Connection con = dbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No : "+ rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("Ac : NO");
			}
			else {
				System.out.println("Ac : YES");
			}
			System.out.println("Capacity : " + rs.getInt(3));
			
			System.out.println("---------------------------");

		}
	}
	public int getCapacity(int id) throws SQLException {
		String query = "select Capacity from bus where BusNo =" + id;
		Connection con = dbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}

}
