package ua.zp.brainacad.abstracts;

abstract class AbstractCooker extends AbstractDevice {

    public AbstractCooker(String name, String serialNumber) {
        super(name, serialNumber);
    }

    @Override
    void powerOn() {
        System.out.println("Нажимаем кнопку вкл. Мультиварка включается.");
    }

    @Override
    void powerOff() {
        System.out.println("Нажимаем кнопку выкл. Мультиварка выключается");
    }

    abstract void cook();

}
