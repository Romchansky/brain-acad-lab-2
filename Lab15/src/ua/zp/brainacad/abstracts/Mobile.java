package ua.zp.brainacad.abstracts;

public class Mobile extends Phone {
    private int simCount;
    private String display;


    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
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


