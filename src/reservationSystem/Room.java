package reservationSystem;

public class Room {
	
	private String bedType;
	private int size;
	private boolean isSmokingAllowed;
	private boolean isAvailable;
	
	public Room(String bedType, int size, boolean isSmokingAllowed) {
		this.bedType = bedType;
		this.size = size;
		this.isSmokingAllowed = isSmokingAllowed;
		isAvailable = true;
	}
	
	public String getBedType() {
		return bedType;
	}
	
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isSmokingAllowed() {
		return isSmokingAllowed;
	}
	
	public void setSmokingAllowed(boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
