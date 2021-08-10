package prototypepatternexample;

public class UMLClass implements Prototype {
	private String className="Default prototype class name";

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public Prototype clone() throws CloneNotSupportedException{
		System.out.println("Creating clone of UMLClass");
		return (UMLClass) super.clone();
	}
	
}
