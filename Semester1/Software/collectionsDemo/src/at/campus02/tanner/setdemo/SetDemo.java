package at.campus02.tanner.setdemo;

import java.util.HashSet;

public class SetDemo
{
    public static void main(String[] args)
    {
        HashSet<Integer> myset1 = new HashSet<>();
        myset1.add(1);
        myset1.add(3);
        myset1.add(4);
        myset1.add(2);

        for (Integer number : myset1)
        {
            System.out.println("number: "+number);
        }

        }
}
