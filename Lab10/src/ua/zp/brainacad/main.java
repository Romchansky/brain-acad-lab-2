package ua.zp.brainacad;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {



       Film f1 = new Film("Matrix","110 min","Science fiction/Action");
       Film f2 = new Film("Star Wars","125 min","Science fiction/Adventure");
       Film f3 = new Film("Star Wars II","160 min","Science fiction/Adventure");
       Film f4 = new Film("Dune","140 min","Science fiction/Adventure");


       Library l1 = new Library("Bukva");
       l1.add(f1);
       l1.add(f2);
       l1.add(f3);
       l1.add(f4);
       System.out.println(Arrays.toString(l1.getFilms()));
       


    }
}

