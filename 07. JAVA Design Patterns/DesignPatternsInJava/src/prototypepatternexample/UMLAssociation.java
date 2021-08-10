package prototypepatternexample;

public class UMLAssociation implements Prototype {
private String associationName="Default prototype association Name ";
	
	@Override
	public Prototype clone() throws CloneNotSupportedException{
		System.out.println("Creating clone of associationName");
		return (UMLAssociation) super.clone();
	}

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}
	
}
