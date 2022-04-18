package PetHouse;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;


public class Pets implements Comparator <Pet> {
    Vector <Pet> pet;
    public Pets() {
        super();
        pet = new Vector<Pet>();
    }

//    public void EnterS() {
//        int n;
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Eneter Number Of Pets: ");
//        n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            Pet p = new Pet();
//            p.Enter();
//            pet.add(p);
//        }
//    }

    public void Prints() {
        for (Pet i:pet) {
            i.Print();
        }
    }

    @Override
    public int compare(Pet p1, Pet p2) {
        int comp = p1.getName().compareTo(p2.getName());
        if (comp != 0)
            return comp;
        else {
            if (p1.getAge() > p2.getAge())
                return 1;
            else
                return -1;
        }
    }
    public void sortCost() {
        Pet p = new Pet();
        for (int i = 0; i < pet.size()-1; i++) {
            for(int j = i+1; j < pet.size(); j++) {
                if(pet.elementAt(i).TotalCost() > pet.elementAt(j).TotalCost())
                    Collections.swap(pet, i, j);

            }
        }
    }

    public void searchName() {
        Collections.swap(pet, 0, 0);
    }
}
Hospital  Class
package PetHouse;

import java.util.Scanner;

public class HospitalPet extends Pet {
    private int pathological; //benh ly


}
