package ua.zp.brainacad.abstracts;


public class Main {
    public static void main(String[] args) {


        AbstractDevice mobile = new Mobile("Google", "45112244", 2, "LED");
        System.out.println(mobile);
        mobile.switchingOnOff();
        //mobile.call();

        System.out.println();

        AbstractDevice smartPhone = new SmartPhone("Google pixel 3", "IPS", 1,"LED");
        System.out.println(smartPhone);
        smartPhone.powerOn();
        smartPhone.powerOff();
        //smartPhone.call();
        //smartPhone.runApp();

        System.out.println();

        DialPhone dialPhone = new DialPhone("Panasonic", "44457866", "Играет имперский марш");
        System.out.println(dialPhone);
        dialPhone.powerOn();
        dialPhone.powerOff();
        dialPhone.call();
        dialPhone.autoAnswer();

        System.out.println();

        Multicook multicook = new Multicook("Sony","556654");
        multicook.cook();
        multicook.switchProgram(5);

        System.out.println();

        Oven oven = new Oven("Lg","2223665");
        oven.cook();
        oven.initTimer(45);

    }


    public static String devices(AbstractDevice... name) {

        for (AbstractDevice a : name) {
            a.powerOff();
            System.out.println("устройство: " + name + "выключено");
        }
        return null;
    }

}

