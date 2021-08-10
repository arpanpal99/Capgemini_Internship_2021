package openclosedprinciple1;

public class Circle implements Shape{
	public double radius;
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

}
