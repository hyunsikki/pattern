package pattern.strategy.DI.example.car;

public class BuyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarMarket carMarket = new CarMarket();
		
		try{
			
			Car bmw = carMarket.displayCar(new BMWFactory());
			System.out.println(bmw.getName() + " :: " + bmw.getPrice());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
