package packages.technics;

import java.util.Date;

public class PassportUtil {

    private PassportUtil() { //закрытый конструктор
        System.out.println("закрытый конструктор");
    }

    public static void warrantyReplace(Passport p3, Date date) {
        p3.setWarrantyStartDate(new Date());
    }
}
