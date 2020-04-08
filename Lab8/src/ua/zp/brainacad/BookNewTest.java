package ua.zp.brainacad;

import java.util.Arrays;

public class BookNewTest {
    public static void main(String[] args) {

        BookNew book = new BookNew();
        book.setName("Ведьмак");
        book.setAuthor("Анджей Сапковский");
        book.setGenre("Фэнтези");
        book.setPublishingOffice("superNOWA");
        book.setDate("1986 - 2013");
        book.setNumberOfBooksInACycle(8);
        book.setNumberOfPage(850);
        book.setPrice(882.50);
        book.sheetBook(850);

        System.out.println(Arrays.toString(book.sheetBook));
        }

    }

