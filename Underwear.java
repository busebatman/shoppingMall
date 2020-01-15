public class Underwear extends Clothing{
	//Calls other constructor with the value 30.0
	public Underwear() {
		this(30.0);
	}
	
	public Underwear(double basePrice) {
		this.setBasePrice(basePrice);
	}
	//Implements calculatePrice method
	@Override
	public double calculatePrice(){
		return (this.getBasePrice() + this.getBasePrice() * this.getVat()) * 1.45;
	}
	//Implements howToWash method
	@Override
	public void howToWash() {
		System.out.println("Wash Underwear at 60 degrees.");
	}

}
