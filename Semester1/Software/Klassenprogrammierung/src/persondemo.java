public class persondemo
{
    public static void main(String[] args) {
        person pers = new person();
        pers.gender = 'm';
        pers.age = 24;
        pers.firstname = "Patrick";
        pers.lastname = "Putzi";

        person persme = new person();
        persme.gender = 'm';
        persme.age = 22;
        persme.firstname = "Leo";
        persme.lastname = "Tanner";

        person p0001 = new person();
        p0001.firstname = "Max";
        p0001.lastname  = "Mustermann";
        p0001.gender = 'm';
        p0001.age = 39;

        //ausgabeperson(persme);
        p0001.personenausgabe();
        persme.personenausgabe();




    }
    public static void ausgabeperson (person p)
    {
        System.out.println(p.firstname + " "+p.lastname + " "+p.age + " Jahre");
    }
}
