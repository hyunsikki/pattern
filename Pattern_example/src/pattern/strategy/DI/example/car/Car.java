package pattern.strategy.DI.example.car;

public class Car {

	private String name;
	private String price;
	
	
	public Car(String name, String price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public String getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(String price) {
		this.price = price;
	}

	public String toString(){
		final String TAB = "	";
		StringBuffer sb = new StringBuffer();
		
		sb.append("Car ( ");
		sb.append(super.toString() + TAB);
		sb.append("name = " + name + TAB);
		sb.append("price = " + price + TAB);
		sb.append(" )");
		
		return sb.toString();
	}
}
