package pattern.strategy.DI.example.car;

public class BMWFactory implements CarFactory {

	@Override
	public Car makeCar() throws Exception {
		// TODO Auto-generated method stub
		return new Car("BMW", "50000 $");
	}

}
