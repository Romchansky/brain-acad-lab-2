package ua.zp.brainacad.abstracts;


public class Main {
    public static void main(String[] args) {


        Mobile mobile = new Mobile();
        mobile.setName("Panasonic");
        mobile.setSimCount(1);
        mobile.setDisplay("IPS");
        System.out.println(mobile);
        mobile.switchingOnOff();
        mobile.call();

        System.out.println();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setName("Google");
        smartPhone.powerOn();
        smartPhone.powerOff();
        smartPhone.call();
        smartPhone.runApp();

        System.out.println();

        DialPhone dialPhone = new DialPhone();
        dialPhone.setName("ZTE");
        dialPhone.powerOn();
        dialPhone.powerOff();
        dialPhone.call();
        dialPhone.autoAnswer();

        System.out.println();

        Multicook multicook = new Multicook();
        multicook.setName("LG");
        multicook.cook();
        multicook.switchProgram(5);

        System.out.println();

        Oven oven = new Oven();
        oven.setName("Bosch");
        oven.cook();
        oven.initTimer(45);

        devicesoff(mobile, smartPhone, dialPhone, multicook, oven);
    }

    private static void devicesoff(AbstractDevice... devicesArray) {

        for (AbstractDevice a : devicesArray) {
            a.powerOff();
            System.out.println("устройство: " + a.getName() + " выключено");
        }
    }

}

