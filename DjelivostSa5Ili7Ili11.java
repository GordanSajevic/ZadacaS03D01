import java.util.Scanner;


public class DjelivostSa5Ili7Ili11 {

	/**
	 * Funkcija provjerava djeljivost unesena dva broja
	 * @param n
	 * @param djelilac
	 * @return boolean
	 */
	
	public static boolean jeDjeljiv(int n, int djelilac)
	{
		boolean djeljivost = false;
		if (n % djelilac == 0)
		{
			djeljivost = true;
		}
		return djeljivost;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		for (int i=broj-1; i>4; i--)
		{
			if ((jeDjeljiv(i, 5) == true) || (jeDjeljiv(i, 7) == true) || (jeDjeljiv(i, 11) == true))
			{
				System.out.println(i);
			}
		}
	}

}
