package ua.zp.brainacad.interfaces;

public class SmartPhone implements Caller,EmailSender {


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
