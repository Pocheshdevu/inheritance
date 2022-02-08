package inheritance;

public class Mountainbike extends Bicycle {

	private int seatHeight;

	public Mountainbike(int gear,int speed,int seatHeight) {
		super(gear,speed);
		this.seatHeight=seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike ["+super.toString()+"\nSeatHeight=" + seatHeight + "]";
	}


}