public class Top extends Clothing {
	//Calls other constructor with the value 20.0
	public Top() {
		this(20.0);
	}

	public Top(double basePrice) {
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
		System.out.println("Wash Top at 40 degrees.");
	}
}
