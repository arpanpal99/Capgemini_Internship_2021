package withoutdependencyinversionprinciple;

public class ElectricPowerSwitch {
		public LightBulb lightbulb;
		public boolean on;
		
		public ElectricPowerSwitch(LightBulb lightbulb) {
			this.lightbulb = lightbulb;
			this.on = true;
		}
		
		public boolean isOn() {
			return this.on;
		}
		
		public void press() {
			boolean checkOn = isOn();
			if(checkOn) {
				lightbulb.turnOff();
				this.on = false;
			}else {
				lightbulb.turnOn();
				this.on = true;
			}
		}
	
}
