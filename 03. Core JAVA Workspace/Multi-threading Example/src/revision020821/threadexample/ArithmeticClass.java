package revision020821.threadexample;

//import java.util.function.BiFunction;

public class ArithmeticClass {
	
	public int sub(int a,int b) {
		return a-b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction substraction = new ArithmeticClass()::sub;
		System.out.println(substraction.substraction(25, 15));
		
	}

}
