import java.util.Scanner;


public class JednakiZnakovi {

	/**
	 * Funkcija provjerava da li se ponavlja barem jedan znak u zadanom stringu
	 * @param str
	 * @return boolean
	 */
	
	public static boolean PonavljanjeZnaka(String str)
	{
		boolean ponavljanje = false;
		int brojac=0;
		for (int i=0; i<str.length(); i++)
		{
			brojac=0;
			for (int j=0; j<str.length(); j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					brojac++;
				}
			}
			if (brojac > 1)
			{
				ponavljanje = true;
			}
		}
		return ponavljanje;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in); 
		System.out.println("Unesite jedan string: ");
		String jedanString = unos.nextLine();
		if (PonavljanjeZnaka(jedanString)==true)
		{
			System.out.println("Tačno");
		}
		else
		{
			System.out.println("Netačno");
		}
	}

}
