package ua.zp.brainacad.typesData;

import ua.zp.brainacad.AbstractData;
import ua.zp.brainacad.Storable;
import ua.zp.brainacad.Type;

public class XMLData extends AbstractData implements Storable<XMLData> {

   Type type = Type.XML;
    String data;

    public XMLData(long id, Type type, T data, Type type1, String data1) {
        super(id, type, data);
        this.type = type1;
        this.data = data1;
    }

    @Override
    public XMLData read() {
        return null;
    }

    @Override
    public void write(XMLData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
