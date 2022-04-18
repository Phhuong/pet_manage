package PetHouse;

import java.util.Scanner;

public class Pet extends Animal{
	private String PETID;
	private double cost;
	//private String sex;
	
	
	public Pet() {
		super();
		PETID = "";
		cost = 0;
	}
	
	public String getPETID() {
		return PETID;
	}
	
	public void setPETID(String petid) {
		PETID = petid;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double Cost) {
		cost = Cost;
	}
	
	public double TotalCost() {
		double total = 0;
		if( getAge() >= 0 && getAge() <= 2)
			total = cost  * 1.5;
		else if( getAge() > 2 && getAge() < 4)
			total = cost  * 0.75;
		else 
			total = cost;
		return total;
	}
	
	public void Enter() {
		super.Enter();
		Scanner sc = new Scanner (System.in);
		// input classic pet information
		System.out.print("Pet's ID:");
		PETID = sc.nextLine();
		
		System.out.print("Cost: ");
		do {
			cost = sc.nextDouble();
			if (cost < 0) {
				System.out.print("Cost Not Valid! Try Again!");
				}
			}while(cost < 0);
}
		public void Print() {
			super.Print();	
			System.out.println("ID: "+ PETID);
			System.out.println("Cost: "+ cost);
		}
}
