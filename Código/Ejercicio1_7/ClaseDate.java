package Ejercicio1_7;

public class ClaseDate {
    private int day=5;
    private int month=7;
    private int year=1902;

    public ClaseDate(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void setDate(int day){
        this.day=day;
    }
    public void setYear(int year){
        this.year=year;
    }

    public void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
