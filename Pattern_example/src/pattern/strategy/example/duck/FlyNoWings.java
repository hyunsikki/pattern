package pattern.strategy.example.duck;

public class FlyNoWings implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't Fly~");
	}

}
