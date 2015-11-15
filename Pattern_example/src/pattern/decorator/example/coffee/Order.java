package pattern.decorator.example.coffee;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage espresso = new Espresso();
		espresso  = new Mocha(espresso);
		espresso  = new Whipping(espresso);
		
		System.out.println(espresso.getDescription() + " : " + espresso.cost());
		
	}

}
