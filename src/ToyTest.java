
public class ToyTest {

	public static void main(String[] args) {
	Toy prva = new Toy("name","tip",12.12);
	Toy druga = new Toy("name2","tip2",12.20,4,10);
	Toy treca = new Toy("name3","tip3",12.32,1989,12);
	Toy cetvrta = new Toy("name4","tip4",12.42,1989,4);
	
	System.out.println(prva);
	System.out.println(druga);
	System.out.println(treca);
	System.out.println(cetvrta);
	Toy kopija= new Toy(prva);
	System.out.println(kopija);
	}

}
