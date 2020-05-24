package packages.transport;

public class PassportUtil {

    private PassportUtil() { //закрытый конструктор
        System.out.println("закрытый конструктор");
    }

    static Passport changeOwner(Passport p5, String ownerName) {
        Passport pass1 = new Passport(ownerName, p5.getCar(), p5.getSerialNumber(), p5.getLabel(),
                p5.getEngineVolume(), p5.getColor());
        System.out.println("New Owner car: " + ownerName);
        System.out.println(pass1);
        return pass1;
    }
}
