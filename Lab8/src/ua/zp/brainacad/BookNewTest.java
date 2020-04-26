package ua.zp.brainacad;

import  java.util.Arrays;

import static java.lang.System.*;
import static ua.zp.brainacad.BookNew.generateArrayByPages;
import static ua.zp.brainacad.BookNew.generateChaptersByPages;


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

        book.setArr(generateArrayByPages(850));
        out.println(Arrays.toString(book.getArr()));
        String [][] result = generateChaptersByPages(book.getArr(),10);
        out.println("Done");
        out.println(Arrays.toString(result));


        }

    }

