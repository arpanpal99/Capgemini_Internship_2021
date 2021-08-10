package withdependencyinversionprinciple;

public class Fridge implements Swtichable {

	@Override
	public void turnOn() {
		System.out.println("Fridge : Fridge is turned on......");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fridge : Fridge is turned off......");
		
	}

}
