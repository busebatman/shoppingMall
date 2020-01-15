public abstract class Clothing extends Item implements Washable {
	//Constructor sets value added tax as 0.18
	public Clothing() {
		this.setVat(0.18);
	}
}
