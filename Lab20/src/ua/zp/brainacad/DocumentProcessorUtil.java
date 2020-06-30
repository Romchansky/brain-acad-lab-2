package ua.zp.brainacad;

public class DocumentProcessorUtil  {
    static Integer ID_COUNTER;

    private DocumentProcessorUtil() {
    }

    public static  <T extends AbstractData & Storable>  StringData convert (T data){
        StringData str = new StringData(ID_COUNTER++, data.getType(),data);
        return str;
    }

   public static <T extends AbstractData & Storable> void build (Storable storeObj, T data){
        storeObj.write(data);
    }


}
