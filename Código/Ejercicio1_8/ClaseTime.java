package Ejercicio1_8;

public class ClaseTime {
    int hour;
    int minute;
    int second;

    public ClaseTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {

        return second;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String x;
        String y;
        String z;
        if (second < 10) {
            x = "0" + second;
        } else {
            x = "" + second;
        }
        if (minute < 10) {
            y = "0" + minute;
        } else {
            y = "" + minute;
        }
        if (hour < 10) {
            z = "0" + hour;
        } else {
            z = "" + hour;
        }

        return z + ":" + y + ":" + x;
    }

    public ClaseTime nextSecond() {
        this.second = second + 1;
        if (second == 60) {
            this.second = 0;
            this.minute = minute + 1;
            if (minute == 60) {
                this.minute = 0;
                this.hour = hour + 1;
                if (hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;

    }

    public ClaseTime previusSecond() {
        this.second = second - 1;
        if (second < 0) {
            this.second = 59;
            this.minute = minute - 1;
            if (minute < 0) {
                this.minute = 59;
                this.hour = hour - 1;
                if (hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}