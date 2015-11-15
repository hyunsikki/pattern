package pattern.strategy.DI.example.car;

public class MorningFactory implements CarFactory {

	@Override
	public Car makeCar() throws Exception {
		// TODO Auto-generated method stub
		return new Car("Mornning", "15 Million KRW");
	}

}
