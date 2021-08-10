package withoutopenclosedprinciple;

public class AreaCalculator {
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}
	
	public double calculateRectangleArea(Circle circle) {
		return 3.14 * circle.radius * circle.radius;
	}
}
