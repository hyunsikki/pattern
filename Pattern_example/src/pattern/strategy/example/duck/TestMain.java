package pattern.strategy.example.duck;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오리 종류
		Duck mallard	= new MallarDuck();
		Duck rubber		= new RubberDuck();
		
		// 행동 정의
		Flyable fly 	= new FlyWithWings();
		Flyable noFly	= new FlyNoWings();
		Quackable quack = new Squack();
		Quackable noQuack = new MuteQuack();
		
		
		// Injection
		mallard.setFlyBehavior(fly);
		mallard.setQuackBehavior(quack);
		rubber.setFlyBehavior(noFly);
		rubber.setQuackBehavior(noQuack);
		
		// Excution
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		
	}

}
