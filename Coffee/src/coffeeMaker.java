import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;
public class coffeeMaker
	{
	static ArrayList<coffee>drinks = new ArrayList<coffee>();
	public static void main(String[] args)
		{
		
		drinks.add(new coffee("Latte", "small", 17.0, 1));
		drinks.add(new coffee("Cappuchino", "small", 10.0, 1));
		drinks.add(new coffee("Mocha", "small", 35.0, 1));
		int choice = inputMenu();
		int size = sizeOptions(choice);
		int espresso = espressoShots(size);
		double small= smallSize(size, espresso);
		double medium= mediumSize (size, espresso);
		double large = largeSize (size, espresso);
		String results = finalResults(choice, size, espresso);
		
		}
	private static int inputMenu()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! What can I get you today?");
			System.out.println("1. Latte 2. Cappuchino 3. Mocha");
			int choice = userInput.nextInt();
			System.out.println("You chose a " + drinks.get(choice-1).getType());
				return choice;
			
		}
	
	public static int sizeOptions(int c)
		{
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Please choose a size");
			System.out.println("1. Small 2. Medium 3. Large");
			int size = userInput2.nextInt();
				{
					if ( size== 1)
						{
						System.out.println("You chose a Small " + drinks.get(c-1).getType());
						}
					if(size==2)
						{
						System.out.println("You chose a Medium " + drinks.get(c-1).getType());
						}
					if(size==3)
						{ 
							System.out.println("You chose a Large " + drinks.get(c-1).getType());
						}
				}
				return size;
		}
	public static int espressoShots(int s)
		{
			int espresso =
				0;
			if (s == 1)
				{
					espresso=1;
				}
			if (s == 2)
				{
					espresso=2;
				}
			if(s ==3)
				{
					espresso=3;
				}
			return espresso;
		}
	
	public static double smallSize(int s, int e)
		{
		double small = 1*drinks.get(s).getSugar() + drinks.get(e).getEspresso()*1;
		return small;
		}
	public static double mediumSize (int s, int e)
		{
		double medium =  drinks.get((int) s).getSugar()*2 + drinks.get(e).getEspresso()*2;
		return medium;
		}
	public static double largeSize( int s, int e)
		{
		double large =  drinks.get((int) s).getSugar()*3 + drinks.get(e).getEspresso()*3;
		return large;
		}
	public static String finalResults(int c, int s, int e)
		{
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("That contains " + drinks.get(s).getSugar() + " grams of sugar!");
		System.out.println("That also contains " + e + " shot(s) of espresso!");
//		
		return null;
		}
	}

	