package pattern.decorator.example.coffee;

public class Espresso extends Beverage {

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4500;
	}

}
