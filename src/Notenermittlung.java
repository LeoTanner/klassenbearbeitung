import java.util.Scanner;

public class Notenermittlung
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie ihre Punkteanzahl an: ");
        int Testpunkte = scan.nextInt();
        System.out.println(Notenbestimmung(Testpunkte));
    }

    public static String Notenbestimmung (int Punkte)
    {
        int Note;
        if(Punkte<=50)
        {
            Note = 5;
            return "Note nicht genügend";
        }
        else if (Punkte > 50 && Punkte <= 64 )
        {
            Note = 4;
            return "Note genügend";
        }
        else if (Punkte > 64 && Punkte <= 77 )
        {
            Note = 3;
            return "Note befriedigend";
        }
        else if (Punkte > 77 && Punkte <= 89)
        {
            Note = 2;
            return "Note gut";
        }
        else
        {
            Note = 1;
            return "Note super";
        }
    }
}
