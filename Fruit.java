public class Fruit extends Food implements Vegan, Washable {
	//Calls other constructor with the value 6.0
	public Fruit() {
		this(6.0);
	}

	public Fruit(double basePrice) {
		this.setBasePrice(basePrice);
	}
	//Implements calculatePrice method
	@Override
	public double calculatePrice() {
		return (this.getBasePrice() + this.getBasePrice() * this.getVat()) * 1.2;
	}
	//Implements hotToWash method
	@Override
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
	}
	//Implements madeOf method
	@Override
	public void madeOf() {
		System.out.println("It is made only of fruits.");
	}
}
