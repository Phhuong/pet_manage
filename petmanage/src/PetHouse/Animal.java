package PetHouse;

import java.util.Scanner;

public class Animal {
		protected String name;
		protected String gender;
		protected int age;
		public Animal(){
			super();
			name = "";//o ho
			gender = "";
			age = 0;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String Name) {
			name = Name;
		}
		
		public String getGender() {
			return gender;
		}
		
		public void setGender(String Gender) {
			gender = Gender;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int Age) {
			age = Age;
		}
		
		public void Enter(){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Information Down Below------ ");
			System.out.print("Pet's Name: ");
			name = sc.nextLine();
			System.out.print("Gender: ");
			gender = sc.nextLine();
			System.out.print("Age: ");
		do {
			age = sc.nextInt();
			if (age < 0 || age > 10) {
				System.out.print("Age Not Valid! Try Again!");
			}
		}while(age < 0 || age > 10);
		}
		
		public void Print(){
			System.out.println("Pet's Name: "+ name);
			System.out.println("Gender: "+ gender);
			System.out.println("Age: "+ age);
		}
}
