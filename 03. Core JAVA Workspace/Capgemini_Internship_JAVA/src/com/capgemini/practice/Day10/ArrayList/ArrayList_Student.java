package com.capgemini.practice.Day10.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.practice.Day10.HashSet.Hash_Student;

public class ArrayList_Student {
	
	public static void main(String[] args) {
		
		//adding Student objects in to hash set
		ArrayList<Hash_Student> stdList = new ArrayList<Hash_Student>();
		Hash_Student std;
			Scanner sc= new Scanner(System.in);
			for(int i=0;i<3;i++) {
				System.out.println("Enter the details of Student");
				System.out.println("Enter the Student id");
				int id = sc.nextInt();
				System.out.println("Enter the Student Name");
				String name = sc.next();
				stdList.add(new Hash_Student(id,name));
			}
			
			
			Iterator<Hash_Student> stuItr = stdList.iterator();
			System.out.println("Student ArrayList values using Iterator");
			while(stuItr.hasNext()) {
				Hash_Student st = stuItr.next();
				System.out.println(st.getSname() + " \t\t\t " + st.getSid());
				System.out.println();
			}
			
			Iterator<Hash_Student> stuItr2 = stdList.iterator();
			System.out.println("Enter the Student id to remove");
			int id = sc.nextInt();
			//int index =0;
			while(stuItr2.hasNext()) {
				Hash_Student st = stuItr2.next();
				if(st.getSid()==id) {
					stuItr2.remove();
				}
			}
			
			//Iterator<Student> stuItr1 = stdList.iterator();
			System.out.println("Enter the Student id to update");
			int uid = sc.nextInt();
			//using forloop
			System.out.println("arraylist values using for loop");
			for(int i=0;i<stdList.size();i++) {
				if(stdList.get(i).getSid()==uid) {
					stdList.get(i).setSname("Ramji");
				}
			}
			
			
			
			
			Iterator<Hash_Student> newstuItr = stdList.iterator();
			System.out.println("Student ArrayList values  using Iterator");
			while(newstuItr.hasNext()) {
				Hash_Student st = newstuItr.next();
				System.out.println(st.getSname() + " \t\t\t " + st.getSid());
				System.out.println();
			}
			
	}

}