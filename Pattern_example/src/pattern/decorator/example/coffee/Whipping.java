package pattern.decorator.example.coffee;

public class Whipping extends CondimentDecorator {

	private Beverage beverage;
	
	public Whipping(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " Added whipping cream";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 500;
	}

}
