package ua.zp.brainacad.abstracts;

public class SmartPhone extends Mobile  {

    private String os;

    public SmartPhone(String name, String serialNumber, int simCount, String display) {
        super(name, serialNumber, simCount, display);
    }


    void runApp(){
        System.out.println("запускаем Google play Музыка");
    }


}
