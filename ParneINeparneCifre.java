import java.util.Scanner;


public class ParneINeparneCifre {

	/**
	 * Funckija vraća sve parne i neparne cifre jednog broja, ali u obrnutom redoslijedu
	 * @param n
	 * @param parnost
	 * @return parni, neparni
	 */
	
	public static int Podbroj (int n, boolean parnost)
	{
		int pomocna=n;
		int parni=0;
		int neparni=0;
		while (pomocna != 0)
		{
			if ((pomocna%10) % 2 == 0)
			{
				parni = parni*10 + pomocna%10;
			}
			else
			{
				neparni = neparni*10 + pomocna%10;
			}
			pomocna = pomocna/10;
		}
		if (parnost==true)
		{
			return OkreniBroj(parni);
		}
		else
		{
			return OkreniBroj(neparni);
		}
	}
	
	/**
	 * Funkcija vraća broj u obrnutom redoslijedu
	 * @param br
	 * @return okrenutiBroj
	 */
	
	public static int OkreniBroj(int br)
	{
		int okrenutiBroj = 0;
		while (br != 0)
		{
			okrenutiBroj = okrenutiBroj*10 + br%10;
			br = br / 10;
		}
		return okrenutiBroj;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		System.out.println("Sve parne cifre: " + Podbroj(broj, true));
		System.out.println("Sve neparne cifre: " + Podbroj(broj, false));
		while (broj != 0)
		{
			System.out.println("Unesite broj: ");
			broj = unos.nextInt();
			System.out.println("Sve parne cifre: " + Podbroj(broj, true));
			System.out.println("Sve neparne cifre: " + Podbroj(broj, false));
		}
	}

}
