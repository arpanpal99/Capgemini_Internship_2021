package prototypepatternexample;

public interface Prototype extends Cloneable {
			public Prototype clone() throws CloneNotSupportedException;
}
/*
 * Suppose we have a program that manipulates the data form db 
 * multiple times
 * it is considered object creation is too costly using new keyword
 * 
 */
