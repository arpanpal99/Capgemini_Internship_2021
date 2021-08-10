package factorypatternexample;

public class FactoryPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer laptop = ComputerFactory.getComputer("laptop", "2gb", "500 GB","2.4 GHz");
		Computer desktop = ComputerFactory.getComputer("desktop", "16gb", "1 TB","2.9GHz");
		System.out.println("Factory Laptop Config = " + laptop);
		System.out.println("Factory Desktop Config = " + desktop);
	}

}
