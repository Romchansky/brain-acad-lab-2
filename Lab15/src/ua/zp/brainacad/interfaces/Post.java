package ua.zp.brainacad.interfaces;

public class Post implements MailSender {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String createMail(String mail) {
        return "Manual write mail: " + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Manual send: " + mail);
    }
}
