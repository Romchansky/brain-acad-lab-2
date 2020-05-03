package ua.zp.brainacad.abstracts;

public class SmartPhone extends Mobile  {

    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    void runApp(){
        System.out.println("запускаем Google play Музыка");
    }
}
