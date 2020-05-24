package packages.test;

import packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport p5 = new packages.transport.Passport("Henry Ford", "Ford", "445122",
                "Mustang BOSS", "5.0 V8", "Red");
        System.out.println(p5);
        String newOwner = " Roman Petrenko";
        p5.changeOwner(newOwner);

    }
}
