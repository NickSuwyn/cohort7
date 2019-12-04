package reservationSystem;

import java.util.ArrayList;
import java.util.List;

public class HotelDB {
	
	private List<Hotel> hotels = new ArrayList<Hotel>();
	
	public HotelDB() {
		hotels.add(new Hotel("Comfort Suites", "1234 E Easy St.", 4.8));
		hotels.add(new Hotel("Econolodge", "4567 W Easy St.", 3.6));
		hotels.get(0).addRoom(new Room("Two Full", 300, false));
		hotels.get(0).addRoom(new Room("King", 320, false));
		hotels.get(0).addRoom(new Room("Queen and Hide-away", 350, false));
		hotels.get(1).addRoom(new Room("King", 320, false));
		hotels.get(1).addRoom(new Room("Queen and Hide-away", 350, false));
	}
	
	public List<Hotel> getHotels() {
		return hotels;
	}

}
