package ua.zp.brainacad.abstracts;

abstract class AbstractDevice {

    private String name;
    private String serialNumber;

    public AbstractDevice(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    abstract void powerOn();

     abstract void powerOff();

    public void switchingOnOff() {
        powerOn();
        System.out.println("Включение устройства");

    }


}
