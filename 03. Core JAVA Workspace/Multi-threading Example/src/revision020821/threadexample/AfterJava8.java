package revision020821.threadexample;

public class AfterJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread is runnable state using runnable interface");
			}
		};
		Runnable r = () -> {
			System.out.println("Running in runnable thread");
		};
		
		r.run();
		System.out.println("Running in main thread");
	}

}
