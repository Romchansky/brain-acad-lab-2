package ua.zp.brainacad.abstracts;

abstract class AbstractDevice {

    private String name;
    private String serialNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    abstract void powerOn();

     abstract void powerOff();

    public void switchingOnOff() {
        powerOn();
        System.out.println("Включение устройства");

    }


}
