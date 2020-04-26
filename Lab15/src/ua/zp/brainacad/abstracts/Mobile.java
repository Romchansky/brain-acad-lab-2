package ua.zp.brainacad.abstracts;

public class Mobile extends Phone {
    private int simCount;
    private String display;

    public Mobile(String name, String serialNumber, int simCount, String display) {
        super(name, serialNumber);
        this.simCount = simCount;
        this.display = display;
    }


    @Override
    void powerOn() {
        System.out.println("Зажимаем кнопку, мобильный телефон включается");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку, телефон отключается");
    }

    @Override
    void call() {
        System.out.println("Открываем список контактов, находим номер, нажимаем вызов");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "simCount=" + simCount +
                ", display='" + display + '\'' +
                '}';
    }
}
