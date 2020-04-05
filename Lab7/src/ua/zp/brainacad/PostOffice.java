package ua.zp.brainacad;


public class PostOffice {

    public static String Index = "69061";
    public String name;
    public String city;
    public String street;
    public int number;
    public String workHours;
    public String [] daysWork = new String [5];
    public String [] weekend = new String[2];

    public String[] getWeekend() {
        return weekend;
    }

    public void setWeekend(String[] weekend) {
        this.weekend = weekend;
    }

    public static String getIndex() {
        return Index;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String[] getDaysWork() {
        return daysWork;
    }

    public void setDaysWork(String[] daysWork) {
        this.daysWork = daysWork;
    }

}


