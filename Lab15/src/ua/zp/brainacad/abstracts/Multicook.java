package ua.zp.brainacad.abstracts;

public class Multicook extends AbstractCooker{

    @Override
    void cook() {
        System.out.println("Происходит процесс разогрева еды");
    }
    void switchProgram(int count){
        System.out.println("Включена программа: №" + count );
    }
}
