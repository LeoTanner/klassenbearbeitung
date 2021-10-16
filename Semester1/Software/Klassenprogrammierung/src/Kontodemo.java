import java.util.Scanner;

public class Kontodemo
{
    public static void main(String[] args) {
        Konto kon1 = new Konto();
        Konto Nachbar = new Konto();
        Konto newKonto = new Konto();

        Scanner scn = new Scanner(System.in);

        System.out.print("Geben sie ihren Namen ein:");
        String kontonamen = scn.nextLine();

        newKonto.setKontoinhaber(kontonamen);
        newKonto.aufbuchen();
        newKonto.abbuchen();

        newKonto.aufbuchen(200);
        newKonto.abbuchen(300);
        newKonto.outputKonto();

        kon1.initialize("Leo Tanner", 400);
        Nachbar.initialize("Patrick Putzi", 3);

        /*kon1.outputKonto();
        kon1.aufbuchen(50);
        kon1.abbuchen(450);
        kon1.outputKonto();*/
    }

}
