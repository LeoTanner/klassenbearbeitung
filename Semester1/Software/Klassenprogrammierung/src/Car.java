public class Car
{
    public String manufacturer;
    public String colour;
    public int productionYear;
    public String model;
    public int horsepower;
    public double co2Emission;
    public int currentspeed;


    public void initialize (String manufacturer, String colour, int productionYear, String model, int horsepower, double co2Emission, int currentspeed)
    {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.productionYear = productionYear;
        this.model = model;
        this.horsepower = horsepower;
        this.co2Emission = co2Emission;
        this.currentspeed = currentspeed;
    }

    public void printcar()
    {
        System.out.println(getManufacturer() + " "+ getModel() + " "+ getColour());
    }


    public void setManufacturer(String manufacturer)
    {
        //Parameter / lokale Variablen in Methoden, wie Attribute verwenden
        if(manufacturer.equalsIgnoreCase("FIAT"))
        {
            this.manufacturer = manufacturer;
        }
        else
        {
            System.out.println("Falscher Hersteller");
        }

    }

    public void accelerate()
    {
        currentspeed += 10;
    }

    public void accelerate (int speed)
    {
        currentspeed += speed;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }
}
