public class Toy {
	private String name;
	private String type;
	private double price;
	private int made;
	private int ageRestriction;
	private int quantity;

	/**
	 * Konstruktor kreira igracku i unosi ime, tip i cijenu, ostale vrijednosti
	 * su default
	 * 
	 * @param name
	 *            Ime igracke
	 * @param type
	 *            Tip igracke
	 * @param price
	 *            Cijena igracke
	 */
	public Toy(String name, String type, double price) {
		setName(name);
		setType(type);
		setPrice(price);
		setMade(2014);
		setAgeRestriction(0);
		setQuantity(1);
	}

	/**
	 * Konstruktor kreira igracku i unosi sve njegove atribute
	 * 
	 * @param name
	 *            Ime igracke
	 * @param type
	 *            Tip igracke
	 * @param price
	 *            Cijena igracke
	 * @param made
	 *            Godina proizvodnje
	 * @param ageRestriction
	 *            Dozvoljena dob
	 * @param quantity
	 *            Kolicina
	 */
	public Toy(String name, String type, double price, int made,
			int ageRestriction, int quantity) {
		setName(name);
		setType(type);
		setPrice(price);
		setMade(made);
		setAgeRestriction(ageRestriction);
		setQuantity(quantity);
	}

	/**
	 * Konstruktor kreira igracku i unosi 4 parametra od kojih je jedan
	 * uslovljen uvjetima
	 * 
	 * @param name
	 *            Ime igracke
	 * @param type
	 *            Tip igracke
	 * @param price
	 *            Cijena igracke
	 * @param undefined
	 *            Godina proizvodnje ili Dozvoljena dob, ovisno od zadovoljenog
	 *            uvjeta
	 * @param quantity
	 *            Kolicina
	 */
	public Toy(String name, String type, double price, int undefined,
			int quantity) {
		setName(name);
		setType(type);
		setPrice(price);
		if (undefined > 100) {
			setMade(undefined);
		} else
			setAgeRestriction(undefined);
		setQuantity(quantity);
	}

	/**
	 * Konstruktor kreira identicnu unesenu igracku
	 * 
	 * @param other
	 *            Igracka koja se kopira
	 */

	public Toy(Toy other) {
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.made = other.made;
		this.ageRestriction = other.ageRestriction;
	}

	/**
	 * Vraca Naziv
	 * 
	 * @return Naziv igracke
	 */
	public String getName() {

		return name;
	}

	/**
	 * Postavlje naziv igracke, ako je unos prazan, baca exception
	 * 
	 * @param name
	 *            Naziv igracke
	 */
	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Ime prazno!");
		} else
			this.name = name;
	}

	/**
	 * Vraca tip igracke
	 * 
	 * @return Tip igracke
	 */
	public String getType() {
		return type;
	}

	/**
	 * Postavlja vrijednost tipa igracke
	 * 
	 * @param type
	 *            Tip igracke
	 */
	public void setType(String type) {
		if (type.length() < 1) {
			throw new IllegalArgumentException("Tip prazno!");
		} else
			this.type = type;
	}

	/**
	 * Vraca cijenu igracke
	 * 
	 * @return Cijena igracke
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Postavlja vrijednost igracke
	 * 
	 * @param price
	 *            Cijena igracke
	 */
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Cijena manja od 0!");
		} else
			this.price = price;
	}

	/**
	 * Vraca god. proizvodnje igracke
	 * 
	 * @return God. proizvodnje igracke
	 */
	public int getMade() {
		return made;
	}

	/**
	 * Postavlja vrijednost igracke
	 * 
	 * @param made
	 *            God. proizvodnje igracke
	 */
	public void setMade(int made) {
		this.made = made;
	}

	/**
	 * Vraca dozvoljenu godisnju dob za igracku
	 * 
	 * @return Dozvoljenu godisnju dob za igracku
	 */
	public int getAgeRestriction() {
		return ageRestriction;
	}

	/**
	 * Postavlja vrijednost dozovljene godisnje dobi za igracku
	 * 
	 * @param ageRestriction
	 *            Dazvoljena godisnja dob za igracku
	 */
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	/**
	 * Vraca kolicinu igracke
	 * 
	 * @return Kolicina igracke
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Postvalja kolicinu za igracku
	 * 
	 * @param quantity
	 *            Kolicina za igracku
	 */

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Ispisuje igracku i sve njene osobine
	 * 
	 * @param out
	 *            String koji sadrzi ispis igracke
	 */
	public String toString() {
		String out = "";
		out += "Name: " + this.name;
		out += "\nType: " + this.type;
		out += "\nPrice: " + this.price;
		out += "\nMading age: " + this.made;
		out += "\nAge res.: " + this.ageRestriction;
		out += "\nQuantity: " + this.quantity + "\n\n";
		return out;
	}

	/**
	 * Povecava koliciu neke igracke
	 * 
	 * @param additional
	 *            Koliko treba povecati kolicinu
	 */
	public void increaseQuantity(int additional) {
		this.quantity += additional;
	}
}
