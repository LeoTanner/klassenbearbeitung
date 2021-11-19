public class DemoAnimal
{
    public static void main(String[] args) {
        Animal an1 = new Animal("Henry",3,"Loewe","Rawrrrrr ;)");
        Animal an2 = new Animal("Susi",2,"Schildkroete","rrrrrrrrrrrrr");
        an1.ageCategory();
        an1.giveAnimalLoud();
        an1.getNameAndAge();
    }
}
