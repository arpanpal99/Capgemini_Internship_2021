package com.capgemini.practice.Day16.anonymous_class_example;

public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape() {
			
			int  height = 30;
			@Override
			void perimeter() {
				// TODO Auto-generated method stub
				System.out.println("Shape area = " +(length * height));
			}
			
			@Override
			void area() {
				// TODO Auto-generated method stub
				System.out.println("Shape Perimeter");
				System.out.println("length = " +length);
			}
		};
		s.area();
		s.perimeter();
		
		Vehicle v = new Vehicle() {
			
			int cost = 30000000;
			@Override
			public void costOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("cost of vehicle = " + cost);
			}
			
			@Override
			public void TypeOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("type of vehicle");
				newMethod();
			}
			
			public void newMethod() {
				System.out.println("new Method");
			}
		};
		
		v.costOfVehicle();
		v.TypeOfVehicle();

	}



}
