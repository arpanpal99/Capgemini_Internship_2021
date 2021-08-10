package com.cg.lab4_Inheritance_Polymorphism.Ex1_SavCurrAccount;

public class MainClass {

	public static void main(String[] args) {

		savAccount smith = new savAccount();
		currAccount kathy = new currAccount();

		smith.setName("Smith");
		smith.setAge(25);
		smith.setBalance(2000);
		smith.setAccNum(12345);

		kathy.setName("Kathy");
		kathy.setAge(29);
		kathy.setBalance(3000);
		kathy.setAccNum(67890);

		System.out.println("Smith has: " + smith.getBalance());
		System.out.println("Kathy has: " + kathy.getBalance());

		smith.deposit(2000);
		System.out.println("Smith's present bank balace: " + smith.getBalance());
		kathy.withdraw(2000);
		System.out.println("Kathy has: " + kathy.getBalance());

		smith.withdraw(3600); // 2000+2000-3600 = 4000 (Warning => Balance is low!)
		kathy.withdraw(1100); // 3000-2000-1100 = -100 (Warning => Overdraft limit reached!)
	}

}
