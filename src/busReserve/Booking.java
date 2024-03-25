package busReserve;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Passenger Name : ");
		passengerName=sc.next();
		
		System.out.print("Enter Bus No : ");
		busNo=sc.nextInt();
		
		System.out.print("Enter Date in format dd-MM-yyyy : ");
		String dateInput = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		try {
			date = sdf.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable() throws SQLException{
		BusDAO busdao = new BusDAO();
		int capacity= busdao.getCapacity(busNo);
		
		BookingDAO bookingdao = new BookingDAO();		
		int booked = bookingdao.getBooked(busNo,date);
		
		return booked<capacity;
	}
	

}
