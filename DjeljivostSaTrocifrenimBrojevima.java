import java.util.Scanner;


public class DjeljivostSaTrocifrenimBrojevima {

	/**
	 * Funkcija ispisuje sve trocifrene brojeve koji su djeljivi za zadanim brojem. Funkcija ne vraća nikakvu vrijednost
	 * @param n
	 */
	
	public static void SviDjeljiviBrojevi (int n)
	{
		for (int i=100; i<1000; i++)
		{
			if (i % n == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite jedan prirodan broj: ");
		int broj = unos.nextInt();
		while (broj<0)
		{
			System.out.println("Niste unijeli prirodan broj! Ponovite unos: ");
			broj = unos.nextInt();
		}
		SviDjeljiviBrojevi(broj);
	}

}
