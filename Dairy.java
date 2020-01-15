public class Dairy extends Food {
	//Calls other constructor with the value 8.0
	public Dairy() {
		this(8.0);
	}

	public Dairy(double basePrice) {
		this.setBasePrice(basePrice);
	}
	//Implements calculate price method
	@Override
	public double calculatePrice(){
		return (this.getBasePrice() + this.getBasePrice() * this.getVat()) * 1.3;
	}
}
