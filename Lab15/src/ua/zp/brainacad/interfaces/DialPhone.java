package ua.zp.brainacad.interfaces;

public class DialPhone implements Caller {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void call(String contact) {

    }

    @Override
    public void sos() {

    }
}
