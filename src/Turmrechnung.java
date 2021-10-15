import java.util.Scanner;

public class Turmrechnung
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Zahl für Turmberechnung eingeben: ");
        int Turmzahl = scan.nextInt();
        int i = 2;
        int j = 9;
        int erg = 0;

        while (i < 10)          //Turmrechner multipl. von 2-9
        {
            Turmzahl = Turmzahl * i;
            i++;
            System.out.println(Turmzahl);
        }
        while (j > 1)           //Division von 9-2
        {
            Turmzahl = Turmzahl / j;
            j--;
            System.out.println(Turmzahl);
        }
    }
}
