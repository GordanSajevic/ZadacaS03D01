import java.util.Scanner;


public class SimetricniBroj {

/**
 * Funkcija provjerava da li je broj simetričan ili ne
 * @param br
 * @return boolean
 */
	
	public static boolean Simetrija(int br)
	{
		int pomocna = br;
		int simetricni = 0;
		while (pomocna != 0)
		{
			simetricni = simetricni*10 + pomocna % 10;
			pomocna = pomocna / 10;
		}
		if (simetricni == br)
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in); 
		System.out.println("Unesite broj (0 za kraj): ");
		int broj = unos.nextInt();
		System.out.println(Simetrija(broj));
		while (broj != 0)
		{
			
			System.out.println("Unesite broj: ");
			broj = unos.nextInt();
			if (broj!=0)
			{
				System.out.println(Simetrija(broj));
			}
			else
			{
				break;
			}
		}
	}

}
