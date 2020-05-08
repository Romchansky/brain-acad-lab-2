package ua.zp.brainacad.interfaces;

public interface MailSender {

   /**
    * Метод для создания сообщения
    * @param mail
    * @return
    */

    String createMail(String mail);

    /**
     * Метод для отправки сообщения
     * @param mail
     */

    void sendMail (String mail);


    String getName();
}
