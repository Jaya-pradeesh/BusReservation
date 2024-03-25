package busReserve;
import java.util.Date;
import java.sql.*;
public class BookingDAO {
	
	public int getBooked(int busNo, Date date) throws SQLException {
		
		String query = "select count(Passenger_Name) from booking where Bus_No=? and Booking_Date=?";
		Connection con = dbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1,busNo);
		pst.setDate(2,sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);}
		
	
	public void addBooking(Booking booking) throws SQLException{
		String query = "insert into booking values(?,?,?)";
		Connection con = dbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		
		pst.setInt(1,booking.busNo);
		pst.setString(2, booking.passengerName);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
		
	}

}
