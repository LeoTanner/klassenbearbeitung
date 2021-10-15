import java.util.Scanner;

public class Winterreifen
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  //Initialisieren eines scanners

        System.out.println("Temperatureingabe:");   //Input für Temperatur und Fahrbahm
        int Temperatur = scan.nextInt();
        System.out.println("Ist die Fahrbahn rutschig: (true oder false)");
        boolean Fahrbahn = scan.nextBoolean();

        System.out.println(isWinterReifenPflicht(Temperatur,Fahrbahn));     //Output über Methodenaufrufen
    }

    public static boolean isWinterReifenPflicht (int Temperatur, boolean rutschigeFahrbahn)
    {
        boolean Winterreifenpflicht;
        if (Temperatur < 4 || (Temperatur < 10 && rutschigeFahrbahn == true)) //Test ob Temperatur unter 4 liegt
        {                                                                     //oder unter 10 und rutschige Bahn
            Winterreifenpflicht = true;
        }
        else
        {
            Winterreifenpflicht = false;
        }
        return Winterreifenpflicht;
    }
}
