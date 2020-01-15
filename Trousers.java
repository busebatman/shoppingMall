public class Trousers extends Clothing {
	//Calls other constructor with the value 40.0
	public Trousers() {
		this(40.0);
	}
	
	public Trousers(double basePrice) {
		this.setBasePrice(basePrice);
	}
	//Implements calculatePrice method
	@Override
	public double calculatePrice() {
		return (this.getBasePrice() + this.getBasePrice() * this.getVat()) * 1.2;
	}
	//Implements howToWash method
	@Override
	public void howToWash() {
		System.out.println("Wash Trousers at 30 degrees.");
	}
}
