package reservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private String name;
	private String address;
	private double averageRating;
	private List<Room> rooms;
	
	public Hotel(String name, String address, double averageRating) {
		rooms = new ArrayList<Room>();
		this.name = name;
		this.address = address;
		this.averageRating = averageRating;
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getAverageRating() {
		return averageRating;
	}
	
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}
