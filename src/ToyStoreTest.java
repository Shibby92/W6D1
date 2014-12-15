public class ToyStoreTest {

	public static void main(String[] args) {
		Toy prva = new Toy("name", "tip", 12.12);
		Toy druga = new Toy("name2", "tip2", 12.20, 4, 10);
		Toy treca = new Toy("name3", "tip3", 12.32, 1989, 12);
		Toy cetvrta = new Toy("name4", "tip4", 12.42, 1989, 4);
		Toy kopija = new Toy(prva);
		ToyStore store = new ToyStore("Store 1");
		store.addToy(prva);
		store.addToy(druga);
		store.addToy(treca);
		store.addToy(cetvrta);
		store.addToy(kopija);
		System.out.println(store.toString());

	}

}