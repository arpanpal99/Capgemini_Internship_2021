package structuralpatternsexample.adapterpatternexample;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return convertVolt(v,10);
	}

	private Volt convertVolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return convertVolt(v,40);
	}
	
	

}
