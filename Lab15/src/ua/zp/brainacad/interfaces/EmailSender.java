package ua.zp.brainacad.interfaces;

public interface EmailSender extends MailSender  {

    /**
     * Метод для редактирования сообщения
     * @param mail
     */

    String editMail(String mail);
}
