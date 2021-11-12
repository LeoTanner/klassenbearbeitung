package at.campus02.tanner.studentlist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class studentListDemo {
    public static void main(String[] args) {
        boolean containsbol = false;
        ArrayList<String> StudentList = new ArrayList<>();
        StudentList.add("Tanner");
        StudentList.add("Putzi");
        StudentList.add("Hofer");
        StudentList.add("Tanner");

        StudentList.remove(2);
        //System.out.println(StudentList.contains("Tanner"));
        System.out.println(IsInList(StudentList, "Tanner"));
        System.out.println(IsInList2(StudentList, "Tanner"));
        printstudent(StudentList);

    }

    public static void printstudent(ArrayList<String> StudentList) {
        for (String s : StudentList) {
            System.out.print("student: " + s);
            System.out.print("; ");
        }
        System.out.println("");
    }


    public static boolean IsInList2(ArrayList<String> StudentList, String Student)
    {
        for(int i = 0; i < StudentList.size();i++)
        {
            String stud = StudentList.get(i);
            if(Student.compareTo(stud)==0)
            {
                return true;
            }
        }
        return false;
    }
      public static boolean IsInList(ArrayList<String> StudentList, String Student) {
        for (String StudentinList : StudentList) {
            if (StudentinList.equals(Student)) {
                return true;
            }
        }
        return false;
    }

}
