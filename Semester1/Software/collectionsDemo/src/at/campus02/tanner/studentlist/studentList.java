package at.campus02.tanner.studentlist;

import java.util.Objects;

public class studentList
{
    private String lastName;

    public studentList (String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studentList that = (studentList) o;
        return Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }
}
