import java.util.Scanner;

public class Konto
{
    private String Kontoinhaber;
    private double Kontostand;

    private Scanner scn = new Scanner(System.in);

    public void initialize (String Kontoinhaber, double Kontostand)
    {
        this.Kontoinhaber = Kontoinhaber;
        this.Kontostand = Kontostand;
    }

    public void outputKonto()
    {
        System.out.println(this.Kontoinhaber + "---" +Kontostand + " €");
    }

    public void aufbuchen ()
    {
        System.out.print("Geben sie einen Betrag zum Aufbuchen ein: ");
        double Betrag = scn.nextDouble();
        if(Betrag > 0) {
            this.Kontostand += Betrag;
            System.out.println("Neuer Kontostand nach dem Aufbuchen beträgt: " +
                    this.Kontostand + " und " + Betrag + " wurde aufgebucht");
        }
        else
        {
            System.out.println("Betrag muss größer null sein");
        }
    }

    public void aufbuchen (double Betrag)
    {
        if(Betrag > 0) {
            this.Kontostand += Betrag;
            System.out.println("Neuer Kontostand nach dem Aufbuchen beträgt: " +
                    this.Kontostand + " und " + Betrag + " wurde aufgebucht");
        }
        else
        {
            System.out.println("Betrag muss größer null sein");
        }
    }

    public void abbuchen ()
    {
        System.out.print("Geben sie einen Betrag zum Abbuchen ein (Betrag muss kleiner Kontostand sein): ");
        double Betrag = scn.nextDouble();
        if(Kontostand >= Betrag) {
            this.Kontostand -= Betrag;
            System.out.println("Neuer Kontostand nach dem Abbuchen beträgt: " +
                    this.Kontostand+" und "+Betrag+" wurde abgebucht");
        }
        else
        {
            System.out.println("Betrag überschreitet ihr Konto");
        }
    }

    public void abbuchen (double Betrag)
    {
        if(Kontostand >= Betrag) {
            this.Kontostand -= Betrag;
            System.out.println("Neuer Kontostand nach dem Abbuchen beträgt: " +
                    this.Kontostand+" und "+Betrag+" wurde abgebucht");
        }
        else
        {
            System.out.println("Betrag überschreitet ihr Konto");
        }
    }

    public String getKontoinhaber() {
        return Kontoinhaber;
    }

    public void setKontoinhaber(String kontoinhaber) {
        Kontoinhaber = kontoinhaber;
        Kontostand = 0;
    }

    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }
}

