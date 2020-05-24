package packages.test;

import packages.technics.Passport;
import packages.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {


        Passport p3 = new packages.technics.Passport("Nootebook", "ASUS",
                "ROG Zephyrus G", "Black", "Gaming", 5, new Date(2020 - 1900, 12 - 5, 10));
        System.out.println(p3);
        PassportUtil.warrantyReplace(p3, new Date(2020 - 1900, 12 - 5, 13));
        System.out.println(p3);


    }
}