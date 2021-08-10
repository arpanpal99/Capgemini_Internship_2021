package singletonexample;

public class SingleTonExample {
	
	private static SingleTonExample singletonclassinstance = null; 
	public String s;
	private SingleTonExample() {
		s = "this is a string from singleton class";
	}

	public static SingleTonExample getInstance() {
		if(singletonclassinstance == null)
			singletonclassinstance = new SingleTonExample();
		return singletonclassinstance;
	}
	
}
