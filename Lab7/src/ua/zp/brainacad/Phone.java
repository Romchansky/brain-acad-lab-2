package ua.zp.brainacad;

public class Phone {


    public String name;
    public String model;
    public String osName;
    public int osVersion;
    public String typeDisplay;
    public int megaPixelCamera;
    boolean isFlash;




    public Phone (String name, String model, String osName, int osVersion,
                 String typeDisplay, int megaPixelCamera, boolean isFlash) {
        this.name = name;
        this.model = model;
        this.osName = osName;
        this.osVersion = osVersion;
        this.typeDisplay = typeDisplay;
        this.megaPixelCamera = megaPixelCamera;
        this.isFlash = isFlash;
    }

     public void infoPhone(){
            System.out.println("Название:" + name + "\nМодель:" +model + "\nНазвание ОС:" + osName +
                    "\nВерсия ОС:" + osVersion + "\nТип дисплея:" + typeDisplay +
                    "\nКоличество МП камеры:" + megaPixelCamera + "\nНаличие вспышки:" + isFlash);
        }
    }


