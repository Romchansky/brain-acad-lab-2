package ua.zp.brainacad;




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
        book.setChapterCount(25);
        book.setPrice(882.50);


        book.goToPage(25);

        for (int i = 0; i < book.getChapterCount(); i++) {
            book.setChapterNamePage(("Chapter" + (i + 1)), (int) Math.round(book.getNumberOfPage() / book.getChapterCount()*i+1), i);
        }




//        book.setArr(generateArrayByPages(850));

//        String [][] result = generateChaptersByPages(book.getArr(),12);

//        out.println(Arrays.toString(result));


    }

}

