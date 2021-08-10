package prototypepatternexample;

import java.util.HashMap;

public class PrototypeFactory {
	
	private static HashMap<String, Prototype> cloneMap = new HashMap<String, Prototype>();
	
	static {
		cloneMap.put("Class", new UMLClass());
		cloneMap.put("Attribute", new UMLAttribute());
		cloneMap.put("Association", new UMLAssociation());
	}
	
	public Prototype getPrototype(String identifier) throws CloneNotSupportedException{
		switch (identifier) {
		case "Class":
			return cloneMap.get("Class").clone();

		case "Attribute":
			return cloneMap.get("Attribute").clone();

		case "Association":
			return cloneMap.get("Association").clone();
	
		}
		return null;
	}

}
