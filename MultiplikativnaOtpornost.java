import java.util.Scanner;


public class MultiplikativnaOtpornost {

	/** 
	 * Funkcija vraća proizvod svih cifara jednog broja
	 * @param n
	 * @return proizvod
	 */
	
	public static int ProizvodCifara(int n) 
	{
		int proizvod = 1;
		while (n != 0)
		{
			proizvod = proizvod * (n % 10);
			n = n / 10;
		}
		return proizvod;
	}
	
	/**
	 * Funkcija vraća multiplikativnu otpornost broja
	 * @param n
	 * @return multOtpornost
	 */
	
	public static int MultOtpornost (int n)
	{
		int multOtpornost = 0;
		while (n > 9)
		{
			n = ProizvodCifara(n);
			multOtpornost++;
		}
		return multOtpornost;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite početak i kraj intervala: ");
		int pocetak = unos.nextInt();
		int kraj = unos.nextInt();
		System.out.println("Unesite broj k: ");
		int k = unos.nextInt();
		for (int i=pocetak; i<=kraj; i++)
		{
			if (MultOtpornost(i) == k)
			{
				System.out.println(i);
			}

		}
	}
}
