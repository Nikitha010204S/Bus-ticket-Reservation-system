
package bus_ticket_reservation_system;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
String passengerName;
int busno;
Date date;

Booking()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter passenger name:");
	passengerName=scanner.next();
	System.out.println("Enter bus number:");
	busno=scanner.nextInt();
	System.out.println("Enter date dd-mm-yyyy");
	String dateInput=scanner.next();
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	try {
		date = dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
{
	int capacity=0;
	for(Bus bus:buses)
	{
		if(bus.getBusno()==busno)
			capacity=bus.getcapacity();
	}
	int booked=0;
	for(Booking b:bookings) {
		if(b.busno==busno && b.date.equals(date)) {
			booked++;
		}
	}
	return booked<capacity?true:false;
	
	
	
}

}
