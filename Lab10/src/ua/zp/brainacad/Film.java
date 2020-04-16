package ua.zp.brainacad;

public class Film {
    String name;
    String time;
    private final String genre;

    {
        System.out.println("Cоздается новый фильм");
    }

    public Film(String name, String time, String genre) {
        this.name = name;
        this.time = time;
        this.genre = genre;
        System.out.println("Фильм " + name + " успешно создан");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

