package liskovprincipleexample;

public class Bus  extends Vehicle{
	public int getSpeed() {
		return 65;
	}

	public int getCubicCapacity() {
		return 165;
	}
	
	public String getEmergencyExitLocation() {
		return "emergency exit is available";
	}
}
