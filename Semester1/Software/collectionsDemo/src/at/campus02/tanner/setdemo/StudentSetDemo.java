package at.campus02.tanner.setdemo;

import java.util.HashSet;

public class StudentSetDemo
{
    public static void main(String[] args) {
        //neues Set deklarieren
        HashSet<String> students = new HashSet<>();

        //studenten vor und Nachname adden
        students.add("Max Mustermann");
        students.add("Patrick Putz");

        String Leo = "Leo Tanner";
        students.add(Leo);

        //student entfernen
        students.remove(Leo);

        //Jeden Studenten im Set ausgeben ; iter
        for (String student : students) 
        {
            System.out.println("student = " + student);
        }

       boolean isLeoTrue = students.contains(Leo);
        System.out.println("isLeoTrue = " + isLeoTrue);
        boolean isMaxTrue = students.contains("Max Mustermann");
        System.out.println("isMaxTrue = " + isMaxTrue);
    }
}
