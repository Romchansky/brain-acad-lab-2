package ua.zp.brainacad;


import static java.util.Objects.isNull;

public class Library {
    Film [] films;
    private final String nameLibrary;

    {
       films = new Film[5];
        Film f1 = new Film("Silent Hill","110 min","Horror");
        Film f2 = new Film("Bad boys","130 min","Action/Comedy");
       films[0]= f1;
       films[1]= f2;
        System.out.println("Добавлены любимые фильмы");
    }

    public Film[] getFilms() {
        return films;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public Library(String nameLibrary) {
        this.nameLibrary = nameLibrary;
        System.out.println("Библиотека " + nameLibrary + " успешно создана");


    }
    public int getIdNullPoint(Film[] films) {
        for (int i = 0; i <films.length ; i++) {
            if(isNull(films[i])){
                return i;
            }

        }
        return -1;
    }

    public void add(Film filmName){
        int index = getIdNullPoint(this.films);
        if(index == -1){
            System.out.println("Место закончилось");
            return;
        }
        this.films[index] = filmName;
    }

}
