package ua.zp.brainacad.interfaces;

public interface Caller {

    /**
     * Метод для вызова контакта
     * @param contact
     */

    void call(String contact);


    /**
     * Метод для базового вызова помощи
     */

    default void sos() {
        System.out.println("Call 911");
    }
}
