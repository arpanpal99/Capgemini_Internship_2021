package prototypepatternexample;

public class UMLAttribute implements Prototype {
	private String attrName="Default prototype attr name";
	
	@Override
	public Prototype clone() throws CloneNotSupportedException{
		System.out.println("Creating clone of UMLAttribute");
		return (UMLAttribute) super.clone();
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	
	
}
