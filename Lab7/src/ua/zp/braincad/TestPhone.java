package ua.zp.braincad;

public class TestPhone {

    public static void main(String[] args) {


        Phone phone1 = new Phone("Google", "Pixel 3", "Android", 10, "OLED",
                12, true);
        Phone phone2 = new Phone("Sony", "Xperia XA1", "Android", 8, "IPS",
                48, true);
        Phone phone3 = new Phone("Iphone", "11", "IOS", 13, "IPS",
                12, true);

      phone1.infoPhone();
      phone2.infoPhone();
      phone3.infoPhone();

    }
}

