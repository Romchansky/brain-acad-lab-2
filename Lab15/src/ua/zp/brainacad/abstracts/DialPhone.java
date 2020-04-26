package ua.zp.brainacad.abstracts;



public class DialPhone extends Phone  {
   private String hasAnswerPhone;


    public DialPhone(String name, String serialNumber, String hasAnswerPhone) {
        super(name, serialNumber);
        this.hasAnswerPhone = hasAnswerPhone;
    }

    @Override
    void powerOn() {
        System.out.println("Втыкаем вилку, телефон работает");
    }

    @Override
    void powerOff() {
        System.out.println("Отключаем от вилки, телефон не работает");
    }

    @Override
    public void call() {
        System.out.println("Поднимаем трубку. набераем номер, идет вызов");
    }

    void autoAnswer(){
        System.out.println("Привет, это автоответчик, оставте сообщение после сигнала");
    }

    @Override
    public String toString() {
        return "DialPhone{" +
                "hasAnswerPhone='" + hasAnswerPhone + '\'' +
                '}';
    }




}
