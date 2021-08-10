package structuralpatternsexample.adapterpatternexample;

public class SocketObjectAdapterImpl implements SocketAdapter {

	//Using composition for adapter pattern
	private Socket soc = new Socket();
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return soc.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = soc.getVolt();
		return convertVolt(v,10);
	}

	private Volt convertVolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = soc.getVolt();
		return convertVolt(v,40);
	}

}
