package ua.zp.brainacad.interfaces;

public class SmartPhone implements Caller, EmailSender {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SmartPhone{}";
    }

    @Override
    public void call(String contact) {

    }

    @Override
    public String editMail(String mail) {
        return null;
    }

    @Override
    public String createMail(String mail) {
        return null;
    }

    @Override
    public void sendMail(String mail) {

    }
}
