package busReserve;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String args[]) throws SQLException {
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();
		
		int userOpt= 1;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		while(userOpt==1 ) {
			System.out.println("Enter 1 for Booking and 2 to Exit - ");
			userOpt=sc.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao= new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("Your Booking is CONFIRMED");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
			
		}
		sc.close();
		
		
	}

}
