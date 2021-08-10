package withdependencyinversionprinciple;

public class Fan implements Swtichable {

	@Override
	public void turnOn() {
		System.out.println("Fan : Fan is turned on......");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fan : Fan is turned off......");
		
	}

}
