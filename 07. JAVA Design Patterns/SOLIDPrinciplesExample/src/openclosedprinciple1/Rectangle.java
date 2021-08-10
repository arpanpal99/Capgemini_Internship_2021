package openclosedprinciple1;

public class Rectangle implements Shape {
	public double length;
	public double width;
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
}
