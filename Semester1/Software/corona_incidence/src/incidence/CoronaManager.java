package incidence;

import java.util.ArrayList;

public class CoronaManager
{
    public static void main(String[] args) {
        Corona stmk20211111 = new Corona("Steiermark","2021-11-11",1300);
        Corona kaernten2021111 = new Corona("Kaernten","2021-11-11",4000);
        Corona stmk20211110 = new Corona("Steiermark","2021-11-10",200);
        Corona vienna20211011 = new Corona("Wien","2021-10-11",8000);
        Corona salz20210501 = new Corona("Salzburg","2021-05-01",4);

        ArrayList<Corona> incidence = new ArrayList<>();
        incidence.add(stmk20211110);
        incidence.add(stmk20211111);
        incidence.add(kaernten2021111);
        incidence.add(vienna20211011);
        incidence.add(salz20210501);

        incidence.add(new Corona("Salzburg","2021-11-12",1345));
        System.out.println("Count of recorded Records: " +incidence.size());

        int Coronaincidence = 0;
        //Anzahl der gesamten Fälle
        for (int i = 0; i < incidence.size(); i++)
        {
            Corona onevalue = incidence.get(i);
            Coronaincidence = Coronaincidence + onevalue.getNumber();
        }
        System.out.println("Bisher in Österreich: "+Coronaincidence+ " Fälle");
    }
}
