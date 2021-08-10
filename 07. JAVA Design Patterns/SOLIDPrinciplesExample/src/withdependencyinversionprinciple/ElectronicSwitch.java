package withdependencyinversionprinciple;

import withoutdependencyinversionprinciple.LightBulb;

public class ElectronicSwitch implements Switch {

	public Swtichable electronicDevice;
	private boolean on;
	
	public ElectronicSwitch(Swtichable electronicDevice) {
		this.electronicDevice = electronicDevice;
		this.on = true;
	}
	
	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}

	@Override
	public void press() {
		// TODO Auto-generated method stub
		boolean checkOn = isOn();
		if(checkOn) {
			electronicDevice.turnOff();
			this.on = false;
		}else {
			electronicDevice.turnOn();
			this.on = true;
		}
	}

}
