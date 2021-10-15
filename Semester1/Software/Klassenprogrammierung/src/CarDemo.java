public class CarDemo
{
    public static void main(String[] args)
    {
        int number = 7;
        Car golf5_G_876TU = new Car(); //Object von Klasse Car erstellt
        Car FiatPanda_G_123RU = new Car();
        Car golf5_LB_345LX = new Car();

        golf5_G_876TU.manufacturer = "Volkswagen";
        golf5_G_876TU.model = "Golf V";
        golf5_G_876TU.horsepower = 90;
        golf5_G_876TU.colour = "black";
        golf5_G_876TU.co2Emission = 300;

        FiatPanda_G_123RU.manufacturer = "Fiat";
        FiatPanda_G_123RU.model = "Panda";
        FiatPanda_G_123RU.horsepower = 75;
        FiatPanda_G_123RU.colour = "red";
        FiatPanda_G_123RU.co2Emission = 120;

        golf5_G_876TU.colour = "black";
        golf5_LB_345LX.model = "Golf V";

        System.out.println("Golf 5 aus Graz: "+golf5_G_876TU.colour);
    }
}
