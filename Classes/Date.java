package Classes;

public class Date {

    private int day = 1;
    private int month = 1;
    private int year = 2017;
    private int format = 0;
    private String monthName = "Enero";

    private static String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Octubre", "Noviembre", "Diciembre"};

    public Date(int dd, int mm, int yy) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public Date(int dd, int mm, int yy, int format){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.setFormat(format);
    }

    public Date() {

    }

    public int getDay() {
            return day;
    }

    public void setDay(int day) {
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day >= 1 && day<= 30){
                this.day = day;
            }
        }
        else if(month == 2){
            if(day >= 1 && day<= 28){
                this.day = day;
            }
        }
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day >= 1 && day <= 31) {
                this.day = day;
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
            this.monthName = getMonthName(month-1);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1900 && year<= 3000) {
            this.year = year;
        }
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        if(format == 1 || format == 2) {
            this.format = format;
        }
    }

    public String getMonthName(int i) {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public static String[] getMonths() {
        return months;
    }

    public String toString(int format) {
        String finaal = "";
        if (format == 0) {
            if (this.day < 10 && this.month < 10) {
                finaal = "0" + this.day + "/0" + this.month + "/" + this.year;
            } else if (this.day < 10 && this.month >= 10) {
                finaal = "0" + this.day + "/" + this.month + "/" + this.year;
            } else if (this.day >= 10 && this.month < 10) {
                finaal= this.day+"/0"+this.month+"/"+this.year;
            }
        }
        else if (format == 1){
            finaal = this.day+"-"+this.monthName.substring(1,3)+"-"+this.year;
        }
        else if(format == 2){
            finaal = this.day+" de "+this.monthName + " de " + this.year;
        }
        System.out.println(finaal);
        return finaal;
    }

    public boolean equals(Date o) {
        if(!(this.day == o.day && this.month == o.month && this.year == o.year)){
            return false;
        }
        else {
            return true;
        }
    }

    public static Date clone(Date o) {
        return new Date(o.day, o.month, o.year, o.format);
    }

    public Date next(Date o){
        if(this.month == 2){
            o.month = this.month+1;
            if(this.day>28){
                o.day = this.day+ 1;
            }
            else{
                o.day = 1;
            }
        }
        else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            o.month = this.month +1;
            if(this.day < 31){
                o.day = this.day+1;
            }
            else{
                o.day = 1;
            }
        }
        else if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10){
            o.month = this.month+1;
            if(this.day < 30){
                o.day = this.day+1;
            }
            else{
                o.day = 1;
            }
        }
        else if(this.month == 12){
            o.month =1;
            if(this.day < 30){
                o.day = this.day+1;
            }
            else{
                o.day = 1;
            }
        }
        return o;
    }

}
