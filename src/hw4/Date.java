package hw4;

public class Date {
    @Override
    public String toString() {
        return getDay() + "." + getMonth() + "." + getYear();
    }
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


}
