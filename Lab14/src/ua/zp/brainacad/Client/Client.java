package ua.zp.brainacad.Client;

import ua.zp.brainacad.Human.Human;

public class Client extends Human {

    private long numberCard;
    private long money;

    public void productInfo(){
        System.out.println("The costumer receives information about the product");
    }

    public void buy(){
        System.out.println("Buys the product");
    }


}
