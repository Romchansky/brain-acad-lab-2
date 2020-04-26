package ua.zp.brainacad.abstracts;

public class Oven extends AbstractCooker {
    public Oven(String name, String serialNumber) {
        super(name, serialNumber);
    }

    @Override
    void cook() {
        System.out.println("Выпекание пиццы");
    }

    void initTimer(int time){
        System.out.println("Время выпекания составляет: " + time + " минут");
    }
}
