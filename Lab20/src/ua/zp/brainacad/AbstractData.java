package ua.zp.brainacad;

public class AbstractData {
    long id;
    Type type;
    String data;

    public <T extends AbstractData & Storable> AbstractData(long id, Type type, T data) {
        this.id = id;
        this.type = type;

        //вызвать метод конверт
    }

    public long getId() {
        return id;
    }
}
