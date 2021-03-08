package ua.zp.brainacad;

public class BookNew {

    static String currency = "грн";
    private String name;
    private String author;
    private String genre;
    private String publishingOffice;
    private String date;
    private int numberOfBooksInACycle;
    private int numberOfPage;
    private int chapterCount;
    private double price;
    private int[] chapters;
    private String[] chapterName;

    public String[] getChapterName() {
        return chapterName;
    }

    public void setChapterNamePage(String name, int page, int index ) {
        this.chapterName[index] = name;
        this.chapters[index] = page;
    }

    public boolean goToPage(int page) {

        if (this.numberOfPage >= page && page > 0) {
            System.out.println("Go to page: " + page);
            return true;
        } else {
            System.out.println("Page not found! In book " + this.numberOfPage + "pages");
            return false;
        }
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }


    public int[] getChapters() {
        return chapters;
    }

    public void setChapters(int[] chapters) {
        this.chapters = chapters;
    }

    public static String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfBooksInACycle() {
        return numberOfBooksInACycle;
    }

    public void setNumberOfBooksInACycle(int numberOfBooksInACycle) {
        this.numberOfBooksInACycle = numberOfBooksInACycle;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public static String [] generateArrayByPages(int numberOfPage) {
//        String [] array = new String[numberOfPage];
//        for (int i = 0; i < numberOfPage; i++) {
//            array[i]=(i+1) + "стр.";
//        }
//        return array;
//    }

//    public static String [][] generateChaptersByPages(String [] pages,int chaptersCount){
//        if(nonNull(pages)){
//            throw new RuntimeException("глав не должно быть меньше чем 1");
//        }
//        if(chaptersCount <= 0) {
//            throw new RuntimeException("глав не должно быть меньше чем 1");
//        }
//
//        int size = pages.length/chaptersCount;
//        String [][] chapters = new String[chaptersCount][size];
//        for (int i = 0; i <size ; i++) {
//            for (int j = i; j < size ; j++) {
//                chapters[i][j] = pages[j+size*i];
//            }
//        }
//        return chapters;
//    }
}



