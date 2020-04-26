package ua.zp.brainacad.abstracts;

public class Multicook extends AbstractCooker{

    public Multicook(String name, String serialNumber) {
        super(name, serialNumber);
    }

    @Override
    void cook() {
        System.out.println("Происходит процесс разогрева еды");
    }
    void switchProgram(int count){
        System.out.println("Включена программа: №" + count );
    }
}
