package packages.citizen;

public class PassportUtil {

    private PassportUtil() { //закрытый конструктор
        System.out.println("закрытый конструктор");
    }

    public static void marriageRegistrate(Passport p1, Passport p2) {
        p1.setSpouseId(p2.getNumber());
        p2.setSpouseId(p1.getNumber());
    }
}
