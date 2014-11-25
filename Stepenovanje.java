import java.util.Scanner;


public class Stepenovanje {

	/**
	 * Funkcija vraća stepenovanu vrijednost za datu bazu i stepen
	 * @param baza
	 * @param stepen
	 * @return rezultat
	 */
	
	public static int pow(int baza, int stepen)
	{
		int rezultat = 1;
		for (int i=0; i<stepen; i++)
		{
			rezultat =  rezultat * baza;
		}
		return rezultat;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite bazu i stepen");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		System.out.println(pow(broj1, broj2));
	}

}
