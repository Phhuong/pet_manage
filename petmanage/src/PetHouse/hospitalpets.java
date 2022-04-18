package PetHouse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hospitalpets {
	private Queue<HospitalPet> q;
	public hospitalpets(){
		super();
		q = new LinkedList<HospitalPet>();
	}
	public void enter(){
		q.add(null);
		q.remove(null);
		q.poll(); //ham in ra r xoa luon phan tu dau Print and off with it's head
		q.size();
	}
	public void add(){
		int amount;
		System.out.println("Enter number of pet: ");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		for(int i = 0; i < amount; i++){
			HospitalPet p = new HospitalPet();
			p.Enter();
			q.add(p);
		}
	}
	
	
	public void remove(String n) {
		HospitalPet o = new HospitalPet();
		o.setName(n);
		q.remove(o.getName());
	}
	
	public void poll() {
		
	}
}
