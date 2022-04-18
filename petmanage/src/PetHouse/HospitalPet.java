package PetHouse;

import java.util.Scanner;


//public class HospitalPet {
//	public static void main(String[] args) {
//		LinkedList<String> pathological = new LinkedList<>();
//		
//		pathological.add("Toxoplasmosis");
//		pathological.add("");
//		pathological.add("third customer");
//		System.out.println("Linkedlist: " + pathological);
//	}
//}
public class HospitalPet extends Animal {
    private int pathological; //benh ly
    private String customername;
    private String address;
    private String phonenumber; 
    private int date;
    
    public void Enter() {
		super.Enter();
    	Scanner sc = new Scanner(System.in);
    	//MENU 
		System.out.println("Here Is Some Pathology");
		System.out.println("1.Gastrointestinal Diseases ");
		System.out.println("2.Leptospirosis");
		System.out.println("3.Sarcoptes scabiei var");
		System.out.println("4.Care");
		System.out.println("5.Parrvovirus");
		System.out.println("6.Castrage");
		System.out.println("7.Other Pathological");
		System.out.println("Enter The Number That Match With Your Pet Pathological.");
		do{
    	System.out.println("Enter Your Pet's Pathology Number : ");
    	pathological = sc.nextInt();
			if(pathological < 0 || pathological > 7)
				System.out.println("No Match With The Number You Enter, Try Again");
		} while (pathological < 0 || pathological > 7);
		
		switch(pathological){
		case 1: 
			System.out.println("Gastrointestinal Diseases"); // benh duong ruot
			date = 3;
			break;
		case 2:
			System.out.println("Leptospirosis"); // xoan khuan
			date = 2;
			break;
		case 3:
			System.out.println("Sarcoptes scabiei var"); //benh ghe
			date = 7;
			break;
		case 4:
			System.out.println("Care"); //benh sai sot
			date = 2;
			break;
		case 5:
			System.out.println("Parrvovirus"); // virus
			date = 6;
			break;
		case 6:
			System.out.println("Castrage"); // thien :>
			date = 1;
			break;
		case 7:
			System.out.println("Other Pathological");
			date = 1;
			break;
		}
		
		System.out.println("Enter Your Full Name: ");
		customername = sc.nextLine();
		
    	System.out.println("Enter Your Address: ");
    	address = sc.nextLine();
    	
    	System.out.println("Enter Your Phone Number: ");
    	phonenumber = sc.nextLine();
    	
    } 
    
    public int getPathological() {
		return pathological;
	}

	public void setPathological(int pathological) {
		this.pathological = pathological;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void Print(){
        System.out.println("Here Your Result, Check Again If Anything Wrong.");
		super.Print();
    	System.out.println("Your Pet Pathology: " + pathological);
		System.out.println("Customer Name: " + customername);
    	System.out.println("Address: "+ address);
		System.out.println("Phone Number: " + phonenumber);
		System.out.println("See You In Next " + date + "days.");
    }
}
    





