public class CarDemo
{
    public static void main(String[] args)
    {
        int number = 7;
        Car golf5_G_876TU = new Car(); //Object von Klasse Car erstellt
        Car FiatPanda_G_123RU = new Car();
        Car golf5_LB_345LX = new Car();
        Car VwLupo_GU_123AB = new Car();

        golf5_G_876TU.setManufacturer("Volkswagen");
        golf5_G_876TU.setModel("Golf V");
        golf5_G_876TU.setHorsepower(90);
        golf5_G_876TU.setColour("black");
        golf5_G_876TU.setCo2Emission(300);

        FiatPanda_G_123RU.setManufacturer("Fiat");
        FiatPanda_G_123RU.setModel("V");
        FiatPanda_G_123RU.setHorsepower(75);
        FiatPanda_G_123RU.setColour("red");
        FiatPanda_G_123RU.setCo2Emission(150);

        VwLupo_GU_123AB.initialize("VW","yellow",1994,"Lupo",45,100,40);
        VwLupo_GU_123AB.printcar();
    }
}
