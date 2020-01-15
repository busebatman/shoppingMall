import java.util.ArrayList;

public class ShoppingMall {

	private static ArrayList<Item> items = new ArrayList<Item>();

	public static ArrayList<Item> getItems() {
		return items;
	}
	//Adds dairy to ArrayList
	public void addDairy() {
		items.add(new Dairy());
	}
	//Adds fruit to ArrayList
	public void addFruit() {
		items.add(new Fruit());
	}
	//Adds top to ArrayList
	public void addTop() {
		items.add(new Top());
	}
	//Adds trousers to ArrayList
	public void addTrousers() {
		items.add(new Trousers());
	}
	//Adds underwear to ArrayList
	public void addUnderwear() {
		items.add(new Underwear());
	}
	//Adds vegetable to ArrayList
	public void addVegetable() {
		items.add(new Vegetable());
	}
	//Adds no-default item to ArrayList
	public void addArbitrary(Item item) {
		items.add(item);
	}
	//Calculates the total price
	public double bill() {
		double count = 0;
		for (Item a : items) {
			count += a.calculatePrice();
		}
		return count;
	}

}
