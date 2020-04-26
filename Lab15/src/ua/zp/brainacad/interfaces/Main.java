package ua.zp.brainacad.interfaces;


public class Main {


    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        String smartPhoneMail = smartPhone.createMail("Hello my name is Google pixel 3");
        smartPhoneMail = smartPhone.editMail(smartPhoneMail);
        smartPhone.sendMail(smartPhoneMail);
        smartPhone.call("Batman");

        smartPhone.sos();

        Post post = new Post();
        String postMail = post.createMail("Hello World");
        post.sendMail(postMail);

        DialPhone dialPhone = new DialPhone();
        dialPhone.sos();

    }
}
