package withdependencyinversionprinciple;

public class Main {

	public static void main(String[] args) {
		Swtichable switchFan = new Fan();
		Switch fanPowerSwitch = new ElectronicSwitch(switchFan);
		fanPowerSwitch.press();
		
		Swtichable switchAC = new AC();
		Switch ACPowerSwitch = new ElectronicSwitch(switchAC);
		ACPowerSwitch.press();
		
		Swtichable switchFridge = new Fridge();
		Switch FridgePowerSwitch = new ElectronicSwitch(switchFridge);
		FridgePowerSwitch.press();
	}
}
