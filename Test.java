public class Test {
	//Buse BATMAN - 150117011
	public static void main(String[] args) {
		ShoppingMall avm = new ShoppingMall();
		avm.addDairy();
		avm.addFruit();
		avm.addTop();
		avm.addTrousers();
		avm.addUnderwear();
		avm.addVegetable();
		Top top = new Top(100);
		avm.addArbitrary(top);
		printContent();
		System.out.println();
		printWashingInstructions();
		System.out.print("\nTotal bill is " + avm.bill());//310.398
	}

	public static void printContent() {
		for (Item a : ShoppingMall.getItems()) {
			if (a instanceof Vegan)
				((Vegan) a).madeOf();
		}
	}

	public static void printWashingInstructions() {
		for (Item a : ShoppingMall.getItems()) {
			if (a instanceof Washable)
				((Washable) a).howToWash();
		}
	}

}
