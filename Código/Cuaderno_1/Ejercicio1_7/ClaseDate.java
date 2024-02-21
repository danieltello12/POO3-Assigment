package Cuaderno_1.Ejercicio1_7;

public class ClaseDate {
    private int day=5;
    private int month=7;
    private int year=1902;

    public ClaseDate(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay(){

        return day;
    }
    public int getMonth(){

        return month;
    }
    public int getYear(){

        return year;
    }

    public void setDay(int day){

        this.day=day;
    }
    public void setMonth(int month){

        this.month=month;
    }
    public void setYear(int year){

        this.year=year;
    }

    public void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        String x;
        String y;
        String z;
        if (day<10){
            x= "0"+day;
        }
        else{
            x = ""+day;
        }
        if (month<10){
            y= "0"+month;
        }
        else{
            y = ""+month;
        }
        if (year<10){
            z= "0"+year;
        }
        else{
            z =""+year;
        }

        return x+"/"+y+"/"+z;
    }


}



