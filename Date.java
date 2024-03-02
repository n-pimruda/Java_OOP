package week6;

public class Date {
    private int month;
    private int day;
    private int year;

    // Default Constructor
    public Date() {
        this.month = 4;
        this.day = 7;
        this.year = 2004;
    }

    // Constructor with parameters
    public Date(int day, int month, int year) {
        this.day = (day >= 1 && day <= 31 && (month != 2 || day <= 29)) ? day : 1;
        this.month = (month >= 1 && month <= 12) ? month : 1;
        this.year = (year >= 1900 && year <= 2013) ? year : 1900;
    }

    public void setMonth(int month) {
        this.month = (month >= 1 && month <= 12) ? month : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = (day >= 1 && day <= 31 && (month != 2 || day <= 29)) ? day : 1;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = (year >= 1900 && year <= 2013) ? year : 1900;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
