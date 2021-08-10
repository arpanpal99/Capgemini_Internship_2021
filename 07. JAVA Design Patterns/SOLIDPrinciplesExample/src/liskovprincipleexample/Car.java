package liskovprincipleexample;

public class Car extends Vehicle {
	public int getSpeed() {
		return 55;
	}

	public int getCubicCapacity() {
		return 155;
	}
	
	public boolean IsHatchBack() {
		return true;
	}
}
