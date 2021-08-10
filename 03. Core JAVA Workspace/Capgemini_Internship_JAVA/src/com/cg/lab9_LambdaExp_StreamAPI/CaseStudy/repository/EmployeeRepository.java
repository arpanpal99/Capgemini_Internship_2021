package com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model.Department;
import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model.Employee;
import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model.EmployeeComparatorByDepartmentId;
import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model.EmployeeComparatorByFirstName;
import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model.EmployeeComparatorById;

public class EmployeeRepository {

	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	ArrayList<Employee> manager = new ArrayList<Employee>();
	BufferedReader sm = new BufferedReader(new InputStreamReader(System.in));
	String designations_list[]= {"Manager","Trainee Engineer","System Analyst","Project Manager","Architect","Content Writter"};
	int department_ids[]= {1001,1002,1003};
	String department_list[]= {"Engineering","Operations","Marketing"};

	// find location of key in an array
	public int findLoc(int arr[],int key) {
		int loc=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				loc=i;
				break;
			}
		}
		return loc;
	}

	// method to camelcase the given string
	public String toCamelCase(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
	}

	// method to create employee and add in arrayList
	public void createEmployee() throws IOException {
		if(employeeList.size()<1) {
			int id;
			String firstName;
			String lastName;
			String[] name1;
			String[] name2;
			String email;
			String phoneNo;
			String hireDate;
			String designation;
			double salary;
			int temp=0;
			System.out.println("\nEnter details of Manager 1 :\n");
			do {
				System.out.print("\nEnter Employee ID : ");
				id=Integer.parseInt(sm.readLine());
				if(id<=0){
					System.out.println("\nEmployee ID cannot be zero or negative.\n");
				}
			}while(id<=0);
			boolean nameresult=false;
			do {
				System.out.print("\nEnter First Name : ");
				firstName=sm.readLine();
				name1=firstName.split(" ");
				nameresult=firstName.matches("^[A-Za-z]+$");
				if(name1[0].length()==0) {
					System.out.println("\nFirst name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nFirst name must only comprise of alphabets.\n");
				}
			}while(name1[0].length()==0 || nameresult==false);
			nameresult=false;
			do {
				System.out.print("\nEnter Last Name : ");
				lastName=sm.readLine();
				name2=lastName.split(" ");
				nameresult=lastName.matches("^[A-Za-z]+$");
				if(name2[0].length()==0) {
					System.out.println("\nLast name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nLast name must only comprise of alphabets.\n");
				}
			}while(name2[0].length()==0 || nameresult==false);
			boolean emailresult=false;
			do {
				System.out.print("\nEnter Email : ");
				email=sm.readLine();
				emailresult = email.matches("^[a-z]+[a-z0-9+_.-]{1}+[a-z0-9]+@[a-z]+[.]+[a-z]+$");
				if(emailresult==false) {
					System.out.println("\nEmail should contain only '@' followed by domain name and should be minimum of length 3 excluding the '@' and domain name and should contain only lowercase alphabets or digits before '@'.\n");
				}
			}while(emailresult==false);
			boolean phoneresult=false;
			do {
				System.out.print("\nEnter Phone No. : ");
				phoneNo=sm.readLine();
				phoneresult=phoneNo.matches("[789][0-9]{9}");
				if(phoneresult==false)
					System.out.println("\nPhone Number must start with 7 or 8 or 9 and should be 10 digits in total.\n");
			}while(phoneresult==false);
			boolean dateresult=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			Date dt=new Date();
			Date todate = new Date();
			do {
				try {
					System.out.print("\nEnter the date of hiring (only dates after 1980 are accepted) : ");
					hireDate=sm.readLine();
					dt=sdf.parse(hireDate);
					dateresult=true;
					ZoneId zd = ZoneId.systemDefault();
					Instant ins1=todate.toInstant();
					Instant ins2=dt.toInstant();
					LocalDate ld1=ins1.atZone(zd).toLocalDate();
					LocalDate ld2=ins2.atZone(zd).toLocalDate();
					Period p=Period.between(ld2, ld1);
					if(p.isNegative()) {
						System.out.println("\nDate is yet to arrive...Try Again...\n");
						dateresult=false;
					}
					else if(dt.getYear()<80) {
						System.out.println("\nDate not accepted...Try Again...\n");
						dateresult=false;
					}
				}catch(ParseException e) {
					System.out.println("\nEither date format is wrong or date does not exist.\n");
					dateresult=false;
				}
			}while(dateresult==false);
			ZoneId zd = ZoneId.systemDefault();
			Instant ins2=dt.toInstant();
			LocalDate ldt=ins2.atZone(zd).toLocalDate();
			int dept_id;
			int temp1=-1;
			do {
				System.out.println();
				System.out.println("Department ID - Department Name");
				System.out.println("===============================");
				for(int i=0;i<department_ids.length;i++)
					System.out.println(department_ids[i]+" - "+department_list[i]);
				System.out.print("\nEnter Department ID : ");
				dept_id=Integer.parseInt(sm.readLine());
				if(dept_id<1001 || dept_id>1003) {
					System.out.println("\nEnter Department ID from the options given below :\n");
				}
			}while(dept_id<1001 || dept_id>1003);
			designation=designations_list[0];
			do {
				System.out.print("\nEnter Salary : ");
				salary=Double.parseDouble(sm.readLine());
				if(salary<=15000){
					System.out.println("\nSalary cannot be less than Rs.15000.\n");
				}
			}while(salary<=15000);
			Department dept=new Department(dept_id,department_list[findLoc(department_ids,dept_id)],0);
			Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,designation,salary,0,dept);
			employeeList.add(emp);
			manager.add(emp);
		}
		else if(employeeList.size()==1) {
			int id;
			String firstName;
			String lastName;
			String[] name1;
			String[] name2;
			String email;
			String phoneNo;
			String hireDate;
			String designation;
			double salary;
			int temp=0;
			System.out.println("\nEnter details of Manager 2 :\n");
			do {
				temp=0;
				do {
					System.out.print("\nEnter Employee ID : ");
					id=Integer.parseInt(sm.readLine());
					if(id<=0){
						System.out.println("\nEmployee ID cannot be zero or negative.\n");
					}
				}while(id<=0);
				for(int i=0;i<employeeList.size();i++) {
					if(id==employeeList.get(i).getEmployeeId() || id==employeeList.get(i).getManagerId()) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmployee ID already present...Please Try Again...");
				}
			}while(temp==1);
			boolean nameresult=false;
			do {
				System.out.print("\nEnter First Name : ");
				firstName=sm.readLine();
				name1=firstName.split(" ");
				nameresult=firstName.matches("^[A-Za-z]+$");
				if(name1[0].length()==0) {
					System.out.println("\nFirst name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nFirst name must only comprise of alphabets.\n");
				}
			}while(name1[0].length()==0 || nameresult==false);
			nameresult=false;
			do {
				System.out.print("\nEnter Last Name : ");
				lastName=sm.readLine();
				name2=lastName.split(" ");
				nameresult=lastName.matches("^[A-Za-z]+$");
				if(name2[0].length()==0) {
					System.out.println("\nLast name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nLast name must only comprise of alphabets.\n");
				}
			}while(name2[0].length()==0 || nameresult==false);
			boolean emailresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Email : ");
					email=sm.readLine();
					emailresult = email.matches("^[a-z]+[a-z0-9+_.-]{1}+[a-z0-9]+@[a-z]+[.]+[a-z]+$");
					if(emailresult==false) {
						System.out.println("\nEmail should contain only '@' followed by domain name and should be minimum of length 3 excluding the '@' and domain name and should contain only lowercase alphabets or digits before '@'.\n");
					}
				}while(emailresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(email.equals(employeeList.get(i).getEmail())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmail already present...Try Again with new email..");
				}
			}while(temp==1);
			boolean phoneresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Phone No. : ");
					phoneNo=sm.readLine();
					phoneresult=phoneNo.matches("[789][0-9]{9}");
					if(phoneresult==false)
						System.out.println("\nPhone Number must start with 7 or 8 or 9 and should be 10 digits in total.\n");
				}while(phoneresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(phoneNo.equals(employeeList.get(i).getPhoneNumber())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nPhone Number already present...Try Again with new Phone No.");
				}
			}while(temp==1);
			boolean dateresult=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			Date dt=new Date();
			Date todate = new Date();
			do {
				try {
					System.out.print("\nEnter the date of hiring (only dates after 1980 are accepted) : ");
					hireDate=sm.readLine();
					dt=sdf.parse(hireDate);
					dateresult=true;
					ZoneId zd = ZoneId.systemDefault();
					Instant ins1=todate.toInstant();
					Instant ins2=dt.toInstant();
					LocalDate ld1=ins1.atZone(zd).toLocalDate();
					LocalDate ld2=ins2.atZone(zd).toLocalDate();
					Period p=Period.between(ld2, ld1);
					if(p.isNegative()) {
						System.out.println("\nDate is yet to arrive...Try Again...\n");
						dateresult=false;
					}
					else if(dt.getYear()<80) {
						System.out.println("\nDate not accepted...Try Again...\n");
						dateresult=false;
					}
				}catch(ParseException e) {
					System.out.println("\nEither date format is wrong or date does not exist.\n");
					dateresult=false;
				}
			}while(dateresult==false);
			ZoneId zd = ZoneId.systemDefault();
			Instant ins2=dt.toInstant();
			LocalDate ldt=ins2.atZone(zd).toLocalDate();
			int dept_id;
			do {
				System.out.println();
				System.out.println("Department ID - Department Name");
				System.out.println("===============================");
				for(int i=0;i<department_ids.length;i++) {
					if(employeeList.get(0).getDepartment().getDepartmentId()!=department_ids[i]) {
						System.out.println(department_ids[i]+" - "+department_list[i]);
					}
				}
				System.out.print("\nEnter Department ID : ");
				dept_id=Integer.parseInt(sm.readLine());
				if(dept_id==employeeList.get(0).getDepartment().getDepartmentId() || dept_id<1001 || dept_id>1003) {
					System.out.println("\nEnter Department ID from the options given below :\n");
				}
			}while(dept_id==employeeList.get(0).getDepartment().getDepartmentId() || dept_id<1001 || dept_id>1003);
			designation=designations_list[0];
			do {
				System.out.print("\nEnter Salary : ");
				salary=Double.parseDouble(sm.readLine());
				if(salary<=15000){
					System.out.println("\nSalary cannot be less than Rs.15000.\n");
				}
			}while(salary<=15000);
			Department dept=new Department(dept_id,department_list[findLoc(department_ids,dept_id)],0);
			Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,designation,salary,0,dept);
			employeeList.add(emp);
			manager.add(emp);
		}
		else if(employeeList.size()==2) {
			int id;
			String firstName;
			String lastName;
			String[] name1;
			String[] name2;
			String email;
			String phoneNo;
			String hireDate;
			String designation;
			double salary;
			int temp=0;
			System.out.println("\nEnter details of Manager 3 :\n");
			do {
				temp=0;
				do {
					System.out.print("\nEnter Employee ID : ");
					id=Integer.parseInt(sm.readLine());
					if(id<=0){
						System.out.println("\nEmployee ID cannot be zero or negative.\n");
					}
				}while(id<=0);
				for(int i=0;i<employeeList.size();i++) {
					if(id==employeeList.get(i).getEmployeeId() || id==employeeList.get(i).getManagerId()) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmployee ID already present...Please Try Again...");
				}
			}while(temp==1);
			boolean nameresult=false;
			do {
				System.out.print("\nEnter First Name : ");
				firstName=sm.readLine();
				name1=firstName.split(" ");
				nameresult=firstName.matches("^[A-Za-z]+$");
				if(name1[0].length()==0) {
					System.out.println("\nFirst name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nFirst name must only comprise of alphabets.\n");
				}
			}while(name1[0].length()==0 || nameresult==false);
			nameresult=false;
			do {
				System.out.print("\nEnter Last Name : ");
				lastName=sm.readLine();
				name2=lastName.split(" ");
				nameresult=lastName.matches("^[A-Za-z]+$");
				if(name2[0].length()==0) {
					System.out.println("\nLast name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nLast name must only comprise of alphabets.\n");
				}
			}while(name2[0].length()==0 || nameresult==false);
			boolean emailresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Email : ");
					email=sm.readLine();
					emailresult = email.matches("^[a-z]+[a-z0-9+_.-]{1}+[a-z0-9]+@[a-z]+[.]+[a-z]+$");
					if(emailresult==false) {
						System.out.println("\nEmail should contain only '@' followed by domain name and should be minimum of length 3 excluding the '@' and domain name and should contain only lowercase alphabets or digits before '@'.\n");
					}
				}while(emailresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(email.equals(employeeList.get(i).getEmail())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmail already present...Try Again with new email..");
				}
			}while(temp==1);
			boolean phoneresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Phone No. : ");
					phoneNo=sm.readLine();
					phoneresult=phoneNo.matches("[789][0-9]{9}");
					if(phoneresult==false)
						System.out.println("\nPhone Number must start with 7 or 8 or 9 and should be 10 digits in total.\n");
				}while(phoneresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(phoneNo.equals(employeeList.get(i).getPhoneNumber())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nPhone Number already present...Try Again with new Phone No.");
				}
			}while(temp==1);
			boolean dateresult=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			Date dt=new Date();
			Date todate = new Date();
			do {
				try {
					System.out.print("\nEnter the date of hiring (only dates after 1980 are accepted) : ");
					hireDate=sm.readLine();
					dt=sdf.parse(hireDate);
					dateresult=true;
					ZoneId zd = ZoneId.systemDefault();
					Instant ins1=todate.toInstant();
					Instant ins2=dt.toInstant();
					LocalDate ld1=ins1.atZone(zd).toLocalDate();
					LocalDate ld2=ins2.atZone(zd).toLocalDate();
					Period p=Period.between(ld2, ld1);
					if(p.isNegative()) {
						System.out.println("\nDate is yet to arrive...Try Again...\n");
						dateresult=false;
					}
					else if(dt.getYear()<80) {
						System.out.println("\nDate not accepted...Try Again...\n");
						dateresult=false;
					}
				}catch(ParseException e) {
					System.out.println("\nEither date format is wrong or date does not exist.\n");
					dateresult=false;
				}
			}while(dateresult==false);
			ZoneId zd = ZoneId.systemDefault();
			Instant ins2=dt.toInstant();
			LocalDate ldt=ins2.atZone(zd).toLocalDate();
			int dept_id;
			int temp1=-1;
			int k=0;
			for(int i=0;i<department_ids.length;i++) {
				if(employeeList.get(0).getDepartment().getDepartmentId()!=department_ids[i] && employeeList.get(1).getDepartment().getDepartmentId()!=department_ids[i]) {
					k=i;
					break;
				}
			}
			dept_id=department_ids[k];
			designation=designations_list[0];
			do {
				System.out.print("\nEnter Salary : ");
				salary=Double.parseDouble(sm.readLine());
				if(salary<=15000){
					System.out.println("\nSalary cannot be less than Rs.15000.\n");
				}
			}while(salary<=15000);
			Department dept=new Department(dept_id,department_list[findLoc(department_ids,dept_id)],0);
			Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,designation,salary,0,dept);
			employeeList.add(emp);
			manager.add(emp);
		}
		else {
			int id;
			String firstName;
			String lastName;
			String[] name1;
			String[] name2;
			String email;
			String phoneNo;
			String hireDate;
			String designation;
			int designation_choice;
			int manager_id = 0;
			double salary;
			int temp=0;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Employee ID : ");
					id=Integer.parseInt(sm.readLine());
					if(id<=0){
						System.out.println("\nEmployee ID cannot be zero or negative.\n");
					}
				}while(id<=0);
				for(int i=0;i<employeeList.size();i++) {
					if(id==employeeList.get(i).getEmployeeId() || id==employeeList.get(i).getManagerId()) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmployee ID already present...Please Try Again...");
				}
			}while(temp==1);
			boolean nameresult=false;
			do {
				System.out.print("\nEnter First Name : ");
				firstName=sm.readLine();
				name1=firstName.split(" ");
				nameresult=firstName.matches("^[A-Za-z]+$");
				if(name1[0].length()==0) {
					System.out.println("\nFirst name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nFirst name must only comprise of alphabets.\n");
				}
			}while(name1[0].length()==0 || nameresult==false);
			nameresult=false;
			do {
				System.out.print("\nEnter Last Name : ");
				lastName=sm.readLine();
				name2=lastName.split(" ");
				nameresult=lastName.matches("^[A-Za-z]+$");
				if(name2[0].length()==0) {
					System.out.println("\nLast name cannot be blank.\n");
				}
				else if(nameresult==false) {
					System.out.println("\nLast name must only comprise of alphabets.\n");
				}
			}while(name2[0].length()==0 || nameresult==false);
			boolean emailresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Email : ");
					email=sm.readLine();
					emailresult = email.matches("^[a-z]+[a-z0-9+_.-]{1}+[a-z0-9]+@[a-z]+[.]+[a-z]+$");
					if(emailresult==false) {
						System.out.println("\nEmail should contain only '@' followed by domain name and should be minimum of length 3 excluding the '@' and domain name and should contain only lowercase alphabets or digits before '@'.\n");
					}
				}while(emailresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(email.equals(employeeList.get(i).getEmail())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nEmail already present...Try Again with new email..");
				}
			}while(temp==1);
			boolean phoneresult=false;
			do {
				temp=0;
				do {
					System.out.print("\nEnter Phone No. : ");
					phoneNo=sm.readLine();
					phoneresult=phoneNo.matches("[789][0-9]{9}");
					if(phoneresult==false)
						System.out.println("\nPhone Number must start with 7 or 8 or 9 and should be 10 digits in total.\n");
				}while(phoneresult==false);
				for(int i=0;i<employeeList.size();i++) {
					if(phoneNo.equals(employeeList.get(i).getPhoneNumber())) {
						temp=1;
						break;
					}
				}
				if(temp==1) {
					System.out.println("\nPhone Number already present...Try Again with new Phone No.");
				}
			}while(temp==1);
			boolean dateresult=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			Date dt=new Date();
			Date todate = new Date();
			do {
				try {
					System.out.print("\nEnter the date of hiring (only dates after 1980 are accepted) : ");
					hireDate=sm.readLine();
					dt=sdf.parse(hireDate);
					dateresult=true;
					ZoneId zd = ZoneId.systemDefault();
					Instant ins1=todate.toInstant();
					Instant ins2=dt.toInstant();
					LocalDate ld1=ins1.atZone(zd).toLocalDate();
					LocalDate ld2=ins2.atZone(zd).toLocalDate();
					Period p=Period.between(ld2, ld1);
					if(p.isNegative()) {
						System.out.println("\nDate is yet to arrive...Try Again...\n");
						dateresult=false;
					}
					else if(dt.getYear()<80) {
						System.out.println("\nDate not accepted...Try Again...\n");
						dateresult=false;
					}
				}catch(ParseException e) {
					System.out.println("\nEither date format is wrong or date does not exist.\n");
					dateresult=false;
				}
			}while(dateresult==false);
			ZoneId zd = ZoneId.systemDefault();
			Instant ins2=dt.toInstant();
			LocalDate ldt=ins2.atZone(zd).toLocalDate();
			int dept_id;
			int temp1=-1;
			System.out.println();
			System.out.println("Department ID - Department Name");
			System.out.println("===============================");
			for(int i=0;i<department_ids.length;i++)
				System.out.println(department_ids[i]+" - "+department_list[i]);
			System.out.print("\nEnter Department ID (any number other than the given above will be taken as no department alloted) : ");
			dept_id=Integer.parseInt(sm.readLine());
			for(int i=0;i<department_ids.length;i++) {
				if(dept_id==department_ids[i]) {
					temp1=i;
					break;
				}
			}
			if(dept_id>=1001 && dept_id<=1003) {
				System.out.println();
				if(dept_id==1001) {
					do {
						for(int i=1;i<designations_list.length;i++) {
							if(i<3)
								System.out.println(i+". "+designations_list[i]);
						}
						System.out.print("\nSelect the designation : ");
						designation_choice=Integer.parseInt(sm.readLine());
						designation=designations_list[designation_choice];
						if(designation_choice<1 || designation_choice>2) 
							System.out.println("\nWrong choice...Try Again\n");
					}while(designation_choice<1 || designation_choice>2);

				}else if(dept_id==1002) {
					int k=0;
					String temp_desg[]=new String[designations_list.length];
					do {
						k=0;
						for(int i=1;i<designations_list.length;i++) {
							if(i==3 || i==4) {
								System.out.println((k+1)+". "+designations_list[i]);
								temp_desg[k]=designations_list[i];
								k++;
							}
						}
						System.out.print("\nSelect the designation : ");
						designation_choice=Integer.parseInt(sm.readLine());
						designation=temp_desg[designation_choice-1];
						if(designation_choice<1 || designation_choice>2) 
							System.out.println("\nWrong choice...Try Again\n");
					}while(designation_choice<1 || designation_choice>2);
				}else {
					int k=0;
					String temp_desg[]=new String[designations_list.length];
					do {
						k=0;
						for(int i=1;i<designations_list.length;i++) {
							if(i==5) {
								System.out.println((k+1)+". "+designations_list[i]);
								temp_desg[k]=designations_list[i];
								k++;
							}
						}
						System.out.print("\nSelect the designation : ");
						designation_choice=Integer.parseInt(sm.readLine());
						designation=designations_list[designation_choice-1];
						if(designation_choice!=1) 
							System.out.println("\nWrong choice...Try Again\n");
					}while(designation_choice!=1);
				}
				if(!designation.equals(designations_list[0])) {
					do {
						do {
							temp=0;
							do {
								temp=0;
								System.out.print("\nEnter Manager ID : ");
								manager_id=Integer.parseInt(sm.readLine());
								if(manager_id<=0){
									System.out.println("\nManager ID cannot be zero or negative.\n");
								}
							}while(manager_id<=0);
							for(int i=0;i<employeeList.size();i++) {
								if(manager_id==manager.get(0).getEmployeeId() || manager_id==manager.get(1).getEmployeeId() || manager_id==manager.get(2).getEmployeeId()) {
									temp=1;
									break;
								}
							}
							if(temp==0) {
								System.out.println("\nManager ID not present...Please Try Again...");
							}
						}while(temp==0);
						if(manager_id==id)
							System.out.println("\nManager ID cannot be same as employee ID.\n");
					}while(manager_id==id);
				}
				do {
					System.out.print("\nEnter Salary : ");
					salary=Double.parseDouble(sm.readLine());
					if(salary<=15000){
						System.out.println("\nSalary cannot be less than Rs.15000.\n");
					}
				}while(salary<=15000);
				if(designation.equals(designations_list[0])) {
					Department dept=new Department(department_ids[temp1],department_list[temp1],0);
					Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,designation,salary,0,dept);
					employeeList.add(emp);
				}
				else {
					Department dept=new Department(department_ids[temp1],department_list[temp1],manager_id);
					Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,designation,salary,manager_id,dept);
					employeeList.add(emp);
				}
			}else {
				Employee emp=new Employee(id,toCamelCase(firstName),toCamelCase(lastName),email,phoneNo,ldt,"no designation",0.0,-1,new Department(0,"0",-1));
				employeeList.add(emp);
			}
		}
		System.out.println("\nEmployee Added Successfully\n");
	}

	// method to find out the sum of salary of all employees
	public void salarySum() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found to sum up salary.\n");
		}else {
			double sum=0;
			for(int i=0;i<employeeList.size();i++) {
				sum+=employeeList.get(i).getSalary();
			}
			System.out.println("\nSum of salary of all employees : Rs."+sum+"\n");
		}
	}

	// count number of employee for a department
	public int countByDepartmentName(String dept) {
		int count=0;
		for(int i=0;i<employeeList.size();i++) {
			if(employeeList.get(i).getDepartment().getDepartmentName().equals(dept)) {
				count++;
			}
		}
		return count;
	}

	// displays count of employee for each department
	public void listDepartmentNameAndEmployeeCount() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}else {
			System.out.println("\nDepartment Name\tCount of Employees");
			System.out.println("==================================");
			for(int i=0;i<department_list.length;i++) {
				System.out.println(department_list[i]+"\t"+countByDepartmentName(department_list[i]));
			}
			System.out.println();
		}
	}

	// displays the senior most employee of the organization
	public void findSeniorMostEmployee() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			Date date=new Date();
			Instant ins=date.toInstant();
			ZoneId zd=ZoneId.systemDefault();
			LocalDate ld=ins.atZone(zd).toLocalDate();
			Period p[]=new Period[employeeList.size()];
			for(int i=0;i<employeeList.size();i++) {
				p[i]=Period.between(employeeList.get(i).getHireDate(),ld);
			}
			Period max = p[0];
			int k=0;
			for(int i=1;i<employeeList.size();i++) {
				if(max.getYears()+max.getMonths()+max.getDays()<p[i].getYears()+p[i].getMonths()+p[i].getDays()) {
					max=p[i];
					k=i;
				}
			}
			System.out.println("The senior most employee of the organization is "+employeeList.get(k).getFirstName()+" "+employeeList.get(k).getLastName()+".\n");
		}
	}

	// displays the senior most employee of the organization
	public void displayEmployeeServiceDuration() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			Date date=new Date();
			Instant ins=date.toInstant();
			ZoneId zd=ZoneId.systemDefault();
			LocalDate ld=ins.atZone(zd).toLocalDate();
			Period p[]=new Period[employeeList.size()];
			for(int i=0;i<employeeList.size();i++) {
				p[i]=Period.between(employeeList.get(i).getHireDate(),ld);
			}

			for(int i=0;i<employeeList.size();i++) {
				System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+(p[i].getMonths()+p[i].getYears()*12)+" months "+p[i].getDays()+" days.");
			}
			System.out.println();
		}
	}

	// method to show employees without department
	public void employeeWithoutDept() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			int counter=0;
			for(int i=0;i<employeeList.size();i++) {
				if(employeeList.get(i).getDepartment().getDepartmentName().equals("no department")) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.println("\nNo employees without department.\n");
			}
			else if(counter==1) {
				System.out.print("\nEmployee without department is ");
				for(int i=0;i<employeeList.size();i++) {
					if(employeeList.get(i).getDepartment().getDepartmentName().equals("no department")) {
						System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+".");
					}
				}
			}else {
				System.out.println("\nEmployee without department are : ");
				for(int i=0;i<employeeList.size();i++) {
					if(employeeList.get(i).getDepartment().getDepartmentName().equals("no department")) {
						System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName());
					}
				}
			}
		}
	}

	// method to show employees without department
	public void deptWithoutEmp() {
		if(employeeList.size()<1) {
			System.out.println("\nDepartment without employees are "+department_list[0]+", "+department_list[1]+" and "+department_list[2]+" department.\n");
		}
		else {
			int counterdept1=0,counterdept2=0,counterdept3=0;
			for(int i=0;i<employeeList.size();i++) {
				if(employeeList.get(i).getDepartment().getDepartmentId()!=1001) {
					counterdept1++;
				}
				if(employeeList.get(i).getDepartment().getDepartmentId()!=1002) {
					counterdept2++;
				}
				if(employeeList.get(i).getDepartment().getDepartmentId()!=1003) {
					counterdept3++;
				}
			}
			if(counterdept1==employeeList.size()) {
				System.out.println("\nDepartment without employees is "+department_list[0]+" department.\n");
			}
			if(counterdept2==employeeList.size()) {
				System.out.println("\nDepartment without employees is "+department_list[1]+" department.\n");
			}
			if(counterdept3==employeeList.size()) {
				System.out.println("\nDepartment without employees is "+department_list[2]+" department.\n");
			}
			if(counterdept1+counterdept2+counterdept3==0) {
				System.out.println("\nNo department without employees.\n");
			}
		}
	}

	// method to find department with highest count of employees
	public void departmentWithHighestCount() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}else {
			int count[]=new int[department_list.length];
			for(int i=0;i<count.length;i++) {
				count[i]=countByDepartmentName(department_list[i]);
			}
			int max=count[0];
			int k=0;
			for(int i=1;i<count.length;i++) {
				if(count[i]>max) {
					max=count[i];
					k=i;
				}
			}
			System.out.println("\nThe department with highest count of employees is "+department_list[k]+" department.\n");
		}
	}

	// method to get day of a week
	public String getDay(Date dt) {
		if(dt.getDay()==0) {
			return "Sunday";
		}
		else if(dt.getDay()==1) {
			return "Monday";
		}
		else if(dt.getDay()==2) {
			return "Tuesday";
		}
		else if(dt.getDay()==3) {
			return "Wednesday";
		}
		else if(dt.getDay()==4) {
			return "Thursday";
		}
		else if(dt.getDay()==5) {
			return "Friday";
		}else {
			return "Saturday";
		}
	}

	// method to list employee name, hire date and day of week on which employee has started
	public void employeeNameWithHireDate() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			ZoneId zd=ZoneId.systemDefault();
			Date dt[]=new Date[employeeList.size()];
			for(int i=0;i<employeeList.size();i++) {
				dt[i]=Date.from(employeeList.get(i).getHireDate().atStartOfDay().atZone(zd).toInstant());
			}
			SimpleDateFormat sdf=new SimpleDateFormat("E, MMM dd yyyy");
			System.out.println("\nEmployee Name | Hire Date | Day of Week");
			System.out.println("=====================================");
			for(int i=0;i<employeeList.size();i++) {
				System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+sdf.format(dt[i])+" "+getDay(dt[i]));
			}
		}
	}

	// method to list employee name, hire date and day of week as Friday on which employee has started
	public void employeeNameWithHireDateFriday() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			ZoneId zd=ZoneId.systemDefault();
			Date dt[]=new Date[employeeList.size()];
			for(int i=0;i<employeeList.size();i++) {
				dt[i]=Date.from(employeeList.get(i).getHireDate().atStartOfDay().atZone(zd).toInstant());
			}
			SimpleDateFormat sdf=new SimpleDateFormat("E, MMM dd yyyy");
			int counter=0;
			for(int i=0;i<employeeList.size();i++) {
				if(dt[i].getDay()==5)
					counter++;
			}
			if(counter==0) {
				System.out.println("\nNone of the employees joined on a Friday.");
			}
			else {
				System.out.println("\nEmployee Name | Hire Date | Day of Week");
				System.out.println("=====================================");
				for(int i=0;i<employeeList.size();i++) {
					if(dt[i].getDay()==5)
						System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+sdf.format(dt[i])+" "+getDay(dt[i]));
				}
			}
		}
	}

	// method to get name of a manager
	public String getManagerName(Employee e) {
		int k=0;
		for(int i=0;i<employeeList.size();i++) {
			if(e.getManagerId()==employeeList.get(i).getEmployeeId()) {
				k=i;
				break;
			}
		}
		return employeeList.get(k).getFirstName()+" "+employeeList.get(k).getLastName();
	}

	// method to return employee name along with manager name
	public void employeeWithManager() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			for(int i=0;i<employeeList.size();i++) {
				if(!employeeList.get(i).getDesignation().equals(designations_list[0]))
					System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" reports to "+getManagerName(employeeList.get(i)));
			}
		}
	}

	// method to return employee without manager
	public void employeeWithoutManager() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			int counter=0;
			for(int i=0;i<employeeList.size();i++) {
				if(employeeList.get(i).getManagerId()<=0)
					counter++;
			}
			if(counter==0) {
				System.out.println("\nNo employee without manager.\n");
			}
			else {
				System.out.println("\nEmployee who didn't report to any manager :");
				for(int i=0;i<employeeList.size();i++) {
					if(employeeList.get(i).getManagerId()<=0)
						System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName());
				}
			}
		}
	}

	// method to print employee name along with salary increased by 15%
	public void salaryHike() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			System.out.println("Employee Name | Salary | Salary increased by 15%");
			System.out.println("=============================================");
			for(int i=0;i<employeeList.size();i++) {
				System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary()+" "+(employeeList.get(i).getSalary()+0.15*employeeList.get(i).getSalary()));
			}
		}
	}

	// method to display employees under a manager
	public void employeeUnderManager(String firstname,String lastname) {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			int index=-1;
			for(int i=0;i<employeeList.size();i++) {
				if(employeeList.get(i).getFirstName().equalsIgnoreCase(firstname) && employeeList.get(i).getLastName().equalsIgnoreCase(lastname) && employeeList.get(i).getDesignation().equals("Manager")) {
					index=i;
					break;
				}
			}
			if(index==-1) {
				System.out.println("\nSuch manager does not exist.");
			}
			else {
				int counter=0;
				for(int i=0;i<employeeList.size();i++) {
					if(employeeList.get(i).getManagerId()==employeeList.get(index).getEmployeeId()) {
						counter++;
					}
				}
				if(counter==0) {
					System.out.println("\nNo employees under this manager.");
				}
				else if(counter==1){
					System.out.print("\nThe employee under Manager "+toCamelCase(firstname)+" "+toCamelCase(lastname)+" is ");
					for(int i=0;i<employeeList.size();i++) {
						if(employeeList.get(i).getManagerId()==employeeList.get(index).getEmployeeId()) {
							System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+".");
						}
					}
				}else {
					System.out.print("\nThe employees under Manager "+toCamelCase(firstname)+" "+toCamelCase(lastname)+" are :\n ");
					for(int i=0;i<employeeList.size();i++) {
						if(employeeList.get(i).getManagerId()==employeeList.get(index).getEmployeeId()) {
							System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName());
						}
					}
				}
			}
		}
	}

	// method to sort employee by Employee id, Department id and First Name
	public void sortEmployees() {
		if(employeeList.size()<1) {
			System.out.println("\nNo employees found.\n");
		}
		else {
			Collections.sort(employeeList, new EmployeeComparatorById());
			Collections.sort(employeeList, new EmployeeComparatorByDepartmentId());
			Collections.sort(employeeList, new EmployeeComparatorByFirstName());
			if(employeeList.size()==1) {
				System.out.println("\nThe employee after sorting by Employee id, Department id and First Name is :");
				for(int i=0;i<employeeList.size();i++) {
					System.out.println(employeeList.get(i)+"\n");
				}
			}
			else {
				System.out.println("\nThe employees after sorting by Employee id, Department id and First Name are :");
				for(int i=0;i<employeeList.size();i++) {
					System.out.println("Employee "+(i+1)+" : ");
					System.out.println(employeeList.get(i)+"\n");
				}
			}
		}
	}
}
