public class ToyStore {
	private String name;
	private Toy[] inventory;
	private int numToys = 0;

	/**
	 * Kreira prodavnicu za igracke
	 * 
	 * @param name
	 *            Naziv prodavnice
	 */
	public ToyStore(String name) {
		setName(name);
		inventory = new Toy[1];

	}

	/**
	 * Vraca naziv prodavnice z aigracke
	 * 
	 * @return Naziv prodavnice
	 */
	public String getName() {
		return name;
	}

	/**
	 * Postavlja naziva prodavnice za igracke
	 * 
	 * @param name
	 *            Naziv prodavnice
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Ispisuje naziv prodavnice kao i sve igracke u njoj
	 * 
	 * @param out
	 *            String koji sadrzi ispis prodavnice
	 */
	public String toString() {
		String out = "";
		out += "Name: " + name;
		out += "\nToy list: \n";
		for (int i = 0; i < numToys; i++) {
			out += inventory[i].toString();
		}
		out += "\n";
		return out;
	}

	/**
	 * Dodaje igracku u inventar
	 * 
	 * @param newToy
	 *            Igracka koja se dodaje u inventar
	 */
	public void addToy(Toy newToy) {
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				inventory[i].increaseQuantity(newToy.getQuantity());
				return;
			}
		}
		if (numToys == inventory.length) {
			resize();
		}
		inventory[numToys] = new Toy(newToy);
		numToys++;

	}

	/**
	 * Ukoliko je niz inventar pun, udvostruci mu se velicina
	 */
	public void resize() {
		int newSize = this.inventory.length * 2;
		Toy[] tmp = new Toy[newSize];
		for (int i = 0; i < numToys; i++) {
			tmp[i] = this.inventory[i];
		}
		this.inventory = tmp;
	}

}
