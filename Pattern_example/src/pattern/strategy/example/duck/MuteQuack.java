package pattern.strategy.example.duck;

public class MuteQuack implements Quackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Mute......");
	}

}
