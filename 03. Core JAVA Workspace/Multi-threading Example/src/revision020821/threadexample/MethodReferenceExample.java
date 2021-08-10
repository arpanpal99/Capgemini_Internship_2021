package revision020821.threadexample;

import java.util.function.BiFunction;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> addition = Add::add;
		int output = addition.apply(10, 20);
		System.out.println(output);
		
		BiFunction<Float, Float, Float> addition1 = Add::add;
		Float output1 = addition1.apply(10.12f, 20.35f);
		System.out.println(output1);
		
		BiFunction<Integer, Float, Float> addition11 = Add::add;
		Float output11 = addition11.apply(10, 20.35f);
		System.out.println(output11);
	}

}
