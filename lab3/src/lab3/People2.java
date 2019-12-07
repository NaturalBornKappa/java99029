package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class People2 <I,N,W>{
	I imie;
	N nazwisko;
	W wiek;

	public People2(String imie, String nazwisko, int wiek) {
		imie = "";
		nazwisko = "";
		wiek = 0;
	}

	/*@Override
	public String toString(List<People2> person) {
		return <string> person;
	}*/

	public static void main(String[] args) {
		
		List<People2> person = new ArrayList<>();
		
		person.add(new People2<String, String, Integer>("Jakub","Bauer",23));
		person.add(new People2<String, String, Integer>("Jan", "Nowak", 69));
		person.add(new People2<String, String, Integer>("Jan", "Kowalski", 59));
		person.add(new People2<String, String, Integer>("Barbara", "Browar", 49));
		
		
		System.out.println(person);
	    System.out.println(person.toString());
	    //System.out.println(person.imie+" "+person.nazwisko+""+person.wiek));
	    
	  }
}
