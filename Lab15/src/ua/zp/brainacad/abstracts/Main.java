package ua.zp.brainacad.abstracts;


public class Main {
    public static void main(String[] args) {

        devices();

        Mobile mobile = new Mobile();
        System.out.println(mobile);
        mobile.switchingOnOff();
        mobile.call();

        System.out.println();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.powerOn();
        smartPhone.powerOff();
        smartPhone.call();
        smartPhone.runApp();

        System.out.println();

        DialPhone dialPhone = new DialPhone();
        dialPhone.powerOn();
        dialPhone.powerOff();
        dialPhone.call();
        dialPhone.autoAnswer();

        System.out.println();

        Multicook multicook = new Multicook();
        multicook.cook();
        multicook.switchProgram(5);

        System.out.println();

        Oven oven = new Oven();
        oven.cook();
        oven.initTimer(45);

        devices(mobile,smartPhone,dialPhone,multicook,oven);
    }

    private static void devices(AbstractDevice... devicesArray) {

        for (AbstractDevice a : devicesArray) {
            a.powerOff();
            System.out.println("устройство: " + a.getName() + "выключено");
        }
    }

}

