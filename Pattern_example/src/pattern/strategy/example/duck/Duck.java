package pattern.strategy.example.duck;

public abstract class Duck {

	private Flyable flyBehavior;
	private Quackable quackBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(Flyable flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(Quackable quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
