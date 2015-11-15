package pattern.strategy.DI.example.car;

public class CarMarket {


	public Car displayCar(CarFactory factory) throws Exception{
		return factory.makeCar();
	}
	
}
