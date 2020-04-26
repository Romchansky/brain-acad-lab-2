package ua.zp.brainacad.abstracts;

abstract class Phone extends AbstractDevice {

    public Phone(String name, String serialNumber) {
        super(name, serialNumber);
    }

    abstract void call();
}
