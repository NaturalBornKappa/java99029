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

	public static int input_int() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
	
	// metody	
	public static boolean if_triangle() {
		System.out.println("Podaj dugosc pierwszego boku: ");
		int a = input_int();
		System.out.println("Podaj dlugosc drugiego boku: ");
		int b = input_int();
		System.out.println("Podaj dlugosc trzeciego boku: ");
		int c = input_int();
		
		if (a + b > c && a + c > b && b + c > a) {
			return true;
		}
		return false;
	}
		
	public static void pole() {
			int wynik = 0;
			System.out.println("Podaj dlugosc podstawy trojkata: ");
			int a = input_int();
			System.out.println("Podaj wysokosc trojkata: ");
			int h = input_int();
			wynik = (a*h/2);
			System.out.println("Pole Twojego trojata to: " + wynik);
		
	}
	

	public static void sides() {
		int[] tab = new int[3];
		
		for(int i = 0; i < 3; i++ ) {
		System.out.println("Podaj dlugosc " + i +" boku: ");
		tab[i] = input_int();
		}	
		
		Arrays.parallelSort(tab);
		for ( int i : tab) {
		System.out.print(i + " ");
		}
		
	}


	public int is_square() {
		System.out.println("Podaj dlugosc pierwszego boku: ");
		int a = input_int();
		System.out.println("Podaj dlugosc drugiego boku: ");
		int b = input_int();
		System.out.println("Podaj dlugosc trzeciego boku: ");
		int c = input_int();
		
		if (a == b || a == c || b == c) {
			System.out.println("Trojkat jest trojkatem prostokatnym. ");
		}
		
		return 0;
	}

/*
	public int is_convex() {
		
		return ;
	}
*/

	public static void main(String[] args) {
	

		//zad 1
		if(Triangle.if_triangle() == true) {
			System.out.println("Z podanych bokow DA sie stworzyc trojkat.");
		}
		else {
			System.out.println("Z podanych bokow NIE DA sie stworzyc trojkat.");
		}

		/*
		//zad 2 
		Triangle.pole();
		*/
		
		//zad 3
		Triangle.boki_kolejnosc();
	}
}

