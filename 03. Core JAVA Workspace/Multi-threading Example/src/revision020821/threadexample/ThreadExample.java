package revision020821.threadexample;

public class ThreadExample extends Thread {
	
	public void run() {
		System.out.println("Thread is in runnable state");
	}

	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.start();
	}
}
