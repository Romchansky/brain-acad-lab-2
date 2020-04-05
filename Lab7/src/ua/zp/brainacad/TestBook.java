package ua.zp.brainacad;

public class TestBook {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.name = "\"Ведьмак\"";
        myBook.author = "Анджей Сапковский";
        myBook.genre = "Фэнтези";
        myBook.publishingOffice = "superNOWA";
        myBook.date = "1986 -2013";
        myBook.numberOfBooksInACycle = 8;
        myBook.numberOfPage = 850;
        myBook.price = 882.50;

        System.out.println("Название книги: " + myBook.name);

        System.out.println("Имя автора: " + myBook.author);
        System.out.println("Жанр: " + myBook.genre);
        System.out.println("Издательство: " + myBook.publishingOffice);
        System.out.println("Даты публикации: " + myBook.date + " года");
        System.out.println("Количество книг в цикле:" + myBook.numberOfBooksInACycle);
        System.out.println("Количество страниц: " + myBook.numberOfPage + " стр.");
        System.out.println("Цена: " + myBook.price + Book.currency);
    }

}
