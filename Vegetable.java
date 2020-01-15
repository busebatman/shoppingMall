public class Vegetable extends Fruit {
	//Calls other constructor with the value 10.0
	public Vegetable() {
        this(10.0);
    }

	public Vegetable(double basePrice) {
        this.setBasePrice(basePrice);
    }
	//Implements calculatePrice method
	@Override
	public double calculatePrice() {
		return (this.getBasePrice() + this.getBasePrice() * this.getVat()) * 1.25;
	}
	//Implements madeOf method
	@Override
	public void madeOf() {
		System.out.println("It is made only of vegetables.");
	}
	//Implements howToWash method
	@Override
	public void howToWash() {
		System.out.println("Wash Vegetable with warm water.");
	}
}
