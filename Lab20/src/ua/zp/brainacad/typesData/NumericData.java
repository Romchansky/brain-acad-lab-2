package ua.zp.brainacad.typesData;

import ua.zp.brainacad.AbstractData;
import ua.zp.brainacad.Storable;
import ua.zp.brainacad.Type;



public class NumericData extends AbstractData implements Storable<NumericData>{
    Type type = Type.NUM;
    Number data;

    public NumericData(long id, Type type, T data, Type type1, Number data1) {
        super(id, type, data);
        this.type = type1;
        this.data = data1;
    }

    @Override
    public NumericData read() {
        return null;
    }

    @Override
    public void write(NumericData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
