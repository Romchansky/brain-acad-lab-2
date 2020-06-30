package ua.zp.brainacad;


public class StringData extends AbstractData {

    Type type;
    String data;

    public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.toString();
    }
}
