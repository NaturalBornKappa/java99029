package zad2;

public class Square extends Figure {

	int number_of_sides;

	
	Square(){
		this.number_of_sides = 4;
	}
	
	@Override
	public
	void printSidesNumber(){
		System.out.println("Fajna metoda co pokazuje ile ma bokow: "+number_of_sides);
	}
}
