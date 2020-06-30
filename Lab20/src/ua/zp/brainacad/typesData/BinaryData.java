package ua.zp.brainacad.typesData;

import ua.zp.brainacad.AbstractData;
import ua.zp.brainacad.Storable;
import ua.zp.brainacad.Type;

public class BinaryData extends AbstractData implements Storable<BinaryData> {

    Type type = Type.BIN;
    BinaryData [] arrayBin;

    public BinaryData(long id, Type type, T data, Type type1, BinaryData[] arrayBin) {
        super(id, type, data);
        this.type = type1;
        this.arrayBin = arrayBin;

    }

    @Override
    public BinaryData read() {
        return null;
    }

    @Override
    public void write(BinaryData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
