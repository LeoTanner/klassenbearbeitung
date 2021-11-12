package incidence;

import java.util.Objects;

public class Corona
{
    private String state;
    private String date;
    private int number;

    //Code-Generate-Constructor
    public Corona(String state, String date, int number) {
        this.state = state;
        this.date = date;
        this.number = number;
    }

    //COde-Generate-Getter
    public String getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    //Code-Generate-toSTring
    @Override
    public String toString() {
        return "Corona{" +
                "state='" + state + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                '}';
    }


    //Code-Generate-Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corona corona = (Corona) o;
        return number == corona.number && Objects.equals(state, corona.state) && Objects.equals(date, corona.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, date);
    }
}
