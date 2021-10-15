import java.util.Scanner;

public class Winterreifen
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperatureingabe:");
        int Temperatur = scan.nextInt();
        System.out.println("Ist die Fahrbahn rutschig: (true oder false)");
        boolean Fahrbahn = scan.nextBoolean();
        System.out.println(isWinterReifenPflicht(Temperatur,Fahrbahn));

    }

    public static boolean isWinterReifenPflicht (int Temperatur, boolean rutschigeFahrbahn)
    {
        boolean Winterreifenpflicht;
        if (Temperatur < 4 || (Temperatur < 10 && rutschigeFahrbahn == true))
        {
            Winterreifenpflicht = true;
        }
        else
        {
            Winterreifenpflicht = false;
        }
        return Winterreifenpflicht;
    }
}
