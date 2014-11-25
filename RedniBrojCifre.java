import java.util.Scanner;


public class RedniBrojCifre {

	/**
	 * FUnkcija vraća n-tu cifru iz zadanog broja
	 * @param br
	 * @param n
	 * @return cifra
	 */
	
	public static int vratiCifru(int br, int n)
	{
		int brojac = 1;
		int cifra = 0;
		while (br != 0)
		{ 
			if (brojac == n)
			{
				cifra = br % 10;
			}
			br = br / 10;
			brojac++;
		}
		return cifra;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite jedan broj i redni broj cifre: ");
		int broj = unos.nextInt();
		int redniBroj = unos.nextInt();
		System.out.println(vratiCifru(broj, redniBroj));
	
	}

}
