package at.campus02.tanner.listdemo;

import java.util.ArrayList;

public class ListDemo
{

    public static void main(String[] args) {
        //ArrayList deklarieren
        ArrayList<Integer> intList = new ArrayList<>();
        // Elemente der Liste hinzufügen

        intList.add(2);
        intList.add(1);
        intList.add(4);
        intList.add(1);
        int first=intList.get(0);

        for(int i = 0; i < intList.size();i++)
        {
            int element = intList.get(i);
            System.out.println("element = " + element);
        }

        /*
        for(int n:intList)
        {
            System.out.println(n);
        }
        */

    }
}
