package ua.zp.brainacad.interfaces;
public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setName("Sony");
        String smartPhoneMail = smartPhone.createMail("Hello my name is Google pixel 3");
        smartPhoneMail = smartPhone.editMail(smartPhoneMail);
        smartPhone.sendMail(smartPhoneMail);
        smartPhone.call("Batman");
        smartPhone.sos();

        Post post = new Post();
        post.setName("Nova Poshta");
        String postMail = post.createMail("Hello World");
        post.sendMail(postMail);

        DialPhone dialPhone = new DialPhone();
        dialPhone.setName("Home Phone");
        dialPhone.sos();

        deviceMailSend(post, smartPhone);
    }
    private static void deviceMailSend(MailSender... devicesArray) {
        for (MailSender m : devicesArray) {
            m.sendMail("Hello world");
            System.out.println("устройство: " + m.getName() + " отправил письмо");

        }
    }

}
