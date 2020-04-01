
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("*********************************************************************");
		System.out.println("\t\tLocation Test");
		
		Location n = new Location();
		Location l = new Location(5,5);
		
		try {
			Location exception = new Location(-3, -9);
		}
		catch (InvalidCoordinateException e) {
			System.out.println("\n" + e.getMessage());
		}
		
		l.update(7, 10);
		int[] coords = l.getCoordinates();
		System.out.println(coords[0] + " " + coords[1]);
		n.setxCoord(15);
		n.setyCoord(17);
		System.out.println(n.getxCoord());
		System.out.println(n.getyCoord());
		System.out.println(l.toString());
		
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println("\t\tAnimal Test");
		
		// Animal a = new Animal(); Will not compile due to Animal being an abstract class
		System.out.println("\nCannot Instantiate, compile error will occur.\n");
		
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println("\t\tGoldfinch Test");
		
		l = new Location(5,5);
		Goldfinch z = new Goldfinch();
		Goldfinch guppy = new Goldfinch(67, l, 7);
		try {
			Goldfinch broken = new Goldfinch(1, n, 17);
		}
		catch (InvalidWingspanException e) {
			System.out.println("\n" + e.getMessage());
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
		try {
			Goldfinch broken = new Goldfinch(0, n, 10);
		}
		catch (InvalidWingspanException e) {
			System.out.println("\n" + e.getMessage());
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(guppy.getLocation());
		guppy.walk(-1);
		System.out.println(guppy.getLocation());
		guppy.walk(0);
		System.out.println(guppy.getLocation());
		guppy.walk(1);
		System.out.println(guppy.getLocation());
		Location fly = new Location(25, 25);
		guppy.setLocation(fly);
		System.out.println(guppy.getLocation());
		
		guppy.setWingSpan(9);
		System.out.println(guppy.getWingSpan());
		guppy.eat();
		System.out.println(guppy.isFull());
		guppy.sleep();
		System.out.println(guppy.isRested());
		guppy.setFull(true);
		guppy.setRested(false);
		System.out.println(guppy.isFull());
		System.out.println(guppy.isRested());
		System.out.println(guppy.toString());
		
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println("\t\tBrownbear Test");
		
		l = new Location(5,5);
		BrownBear b = new BrownBear();
		BrownBear yogie = new BrownBear(50, l, "Grizzly");
		try {
			BrownBear polarBear = new BrownBear(50, l, "Polar Bear");
		}
		catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(yogie.getLocation());
		yogie.walk(-1);
		System.out.println(yogie.getLocation());
		yogie.walk(0);
		System.out.println(yogie.getLocation());
		yogie.walk(1);
		System.out.println(yogie.getLocation());
		yogie.swim(-1);
		System.out.println(yogie.getLocation());
		yogie.swim(0);
		System.out.println(yogie.getLocation());
		yogie.swim(1);
		System.out.println(yogie.getLocation());
		
		String[] s = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
		for(String i : s) {
			yogie.setSubSpecies(i);
			System.out.println(yogie.getSubSpecies());
		}
		yogie.eat();
		System.out.println(yogie.isFull());
		yogie.sleep();
		System.out.println(yogie.isRested());
		yogie.setFull(true);
		yogie.setRested(false);
		System.out.println(yogie.isFull());
		System.out.println(yogie.isRested());
		System.out.println(yogie.toString());
		System.out.println("*********************************************************************");
	   
	}//end main

}//end class
