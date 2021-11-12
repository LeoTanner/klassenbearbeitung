package at.campus02.tanner.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapdemo
{
    public static void main(String[] args) {
        // HashMap deklarieren
        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        //Schlüssel und dazugehörigen Wert hinzufügen
        gradeOfStudents.put("Mustermann",2);
        gradeOfStudents.put("Tanner",1);

        System.out.println("gradeOfStudents = " + gradeOfStudents);

        //Schlüsselwert updaten
        gradeOfStudents.put("Mustermann",3);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        //iteration über alle Elemente ; STRG + ALT + V
        Set<String> students = gradeOfStudents.keySet();
        for (String stu : students)
        {
            Integer grade = gradeOfStudents.get(stu);
            System.out.println("student = "+stu+ "; grade = "+grade);
        }
        
        //gib mir die Note von Mustermann
        Integer gradeofMustermann = gradeOfStudents.get("Mustermann");
        System.out.println("gradeofMustermann = " + gradeofMustermann);

            //2. Möglichkeit Schlüsse und Werte zu bekommen
        Set<Map.Entry<String, Integer>> entries = gradeOfStudents.entrySet();
            for (Map.Entry<String, Integer> entry : entries)
            {
            System.out.println("student = " + entry.getKey()+ " ; grade = " + entry.getValue());
            }
        }
    }
