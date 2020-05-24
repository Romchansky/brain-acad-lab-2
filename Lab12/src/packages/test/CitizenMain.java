package packages.test;

import packages.citizen.Passport;

import static packages.citizen.PassportUtil.marriageRegistrate;

public class CitizenMain {
    public static void main(String[] args) {
        Passport p1 = new Passport("John", "ID", "4455699");
        Passport p2 = new Passport("Roza", "ID", "7799944");
        System.out.println(p1);
        System.out.println(p2);
        marriageRegistrate(p1, p2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
