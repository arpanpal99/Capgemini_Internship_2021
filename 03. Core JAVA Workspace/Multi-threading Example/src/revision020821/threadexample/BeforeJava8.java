package revision020821.threadexample;

public class BeforeJava8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread is runnable state using runnable interface");
			}
		};
		
		r.run();
		System.out.println("this is from main method");
	}

}
