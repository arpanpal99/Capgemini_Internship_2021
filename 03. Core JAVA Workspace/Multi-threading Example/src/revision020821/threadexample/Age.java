package revision020821.threadexample;

public class Age {
	static int age = 25;
	public static void checkAge() {
		
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		//refering to static method
		Addition ad = Age::checkAge;
		ad.add();
		
	}

}
