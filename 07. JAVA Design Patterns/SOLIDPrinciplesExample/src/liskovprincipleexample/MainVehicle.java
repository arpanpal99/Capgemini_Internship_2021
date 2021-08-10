package liskovprincipleexample;

public class MainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle veh = new Bus();
			System.out.println(veh.getSpeed());
			veh = new Car();
			System.out.println(veh.getCubicCapacity());
	}

}
