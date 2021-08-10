package prototypepatternexample;

public class PrototypePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				UMLClass  umlclass = (UMLClass)new PrototypeFactory().getPrototype("Class");
				System.out.println("Name in umlclass instance = " + umlclass.getClassName());
				UMLAttribute  umlAttr = (UMLAttribute)new PrototypeFactory().getPrototype("Attribute");
				System.out.println("Name in umlclass instance = " + umlAttr.getAttrName());
				UMLAssociation  umlAssociation = (UMLAssociation)new PrototypeFactory().getPrototype("Association");
				System.out.println("Name in umlclass instance = " + umlAssociation.getAssociationName());
			}catch (CloneNotSupportedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
