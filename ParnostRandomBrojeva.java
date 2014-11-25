import java.util.Scanner;


public class ParnostRandomBrojeva {
	/**
	 * Funkcija vraća jedan random broj u zadanom intervalu
	 * @param min
	 * @param max
	 * @return random
	 */
	
	public static int randomInInterval(int min, int max)
	{
		if (min > max)
		{
			int pomocna = min;
			min = max;
			max = pomocna;
		}
		int random = min + (int)(Math.random()*(max - min + 1));
		return random;
	}
	
	/**
	 * Funkcija provjerava da li je boj paran ili ne
	 * @param broj
	 * @return boolean
	 */
	
	public static boolean isOdd(int broj)
	{
		boolean parnost = false;
		if (broj % 2 == 0)
		{
			parnost = true;
		}
		return parnost;
	}
	
	public static void main(String[] args) {
		 Scanner unos = new Scanner (System.in);
		 System.out.println("Unesite početak i kraj intervala: ");
		 int pocetak = unos.nextInt();
		 int kraj = unos.nextInt();
		 for (int i=0; i<5; i++)
		 {
			 int random = randomInInterval(pocetak, kraj);
			 if (isOdd(random) == true)
			 {
				 System.out.println("Generisali smo broj "  + random + ", paran je.");
			 }
			 else
			 {
				 System.out.println("Generisali smo broj "  + random + ", neparan je."); 
			 }
		 }
	}

}
