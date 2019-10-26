package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

	static Scanner scan = new Scanner(System.in);
	int a,b,c, h;
	
	// konstruktor
	public Triangle(){
		a = 0;
		b = 0;
		c = 0;
		h = 0;
	}	
	
	// metody	
	public static boolean if_triangle() {
		System.out.println("Podaj d³ugoœæ pierwszego boku: ");
		int a = scan.nextInt();	
		System.out.println("Podaj d³ugoœæ drugiego boku: ");
		int b = scan.nextInt();	
		System.out.println("Podaj d³ugoœæ trzeciego boku: ");
		int c = scan.nextInt();
		
		if (a + b > c && a + c > b && b + c > a) {
			return true;
		}
		return false;
	}
		
	public static void pole() {
			int wynik = 0;
			System.out.println("Podaj d³ugoœæ podstawy trójk¹ta: ");
			int a = scan.nextInt();	
			System.out.println("Podaj wysokoœæ trójk¹ta: ");
			int h = scan.nextInt();	
			wynik = (a*h/2);
			System.out.println("Pole Twojego trój¹ta to: " + wynik);
		
	}
	

	public static void boki_kolejnosc() {
		int[] tab = new int[3];
		
		for(int i = 0; i < 3; i++ ) {
		System.out.println("Podaj d³ugoœæ " + i +" boku: ");
		tab[i] = (int) scan.nextInt();	
		}	
		
		Arrays.parallelSort(tab);
		for ( int i : tab) {
		System.out.print(i + " ");
		}
		
	}


	public int is_square() {
		System.out.println("Podaj d³ugoœæ pierwszego boku: ");
		int a = scan.nextInt();	
		System.out.println("Podaj d³ugoœæ drugiego boku: ");
		int b = scan.nextInt();	
		System.out.println("Podaj d³ugoœæ trzeciego boku: ");
		int c = scan.nextInt();
		
		if (a == b || a == c || b == c) {
			System.out.println("Trójk¹t jest trójk¹tem prostok¹tnym. ");
		}
		
		return 0;
	}

/*
	public int is_convex() {
		
		return ;
	}
*/

	public static void main(String[] args) {
	
		/*
		//zad 1
		if(Triangle.if_triangle() == true) {
			System.out.println("Z podanych boków DA sie stworzyæ trójk¹t.");
		}
		else {
			System.out.println("Z podanych boków NIE DA sie stworzyæ trójk¹t.");
		}
		*/
		/*
		//zad 2 
		Triangle.pole();
		*/
		
		//zad 3
		Triangle.boki_kolejnosc();
	}
}

