package ua.zp.brainacad;

import static java.util.Objects.nonNull;

public class BookNew {

    static String currency = "грн";
    public String name;
    public String author;
    public String genre;
    public String publishingOffice;
    public String date;
    public int numberOfBooksInACycle;
    public int numberOfPage;
    public double price;
    public int [] chapters;
    private String[]arr;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int[]getChapters(){
        return chapters;
    }

    public void setChapters(int [] chapters){
        this.chapters=chapters;
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

    public static String [] generateArrayByPages(int numberOfPage) {
        String [] array = new String[numberOfPage];
        for (int i = 0; i < numberOfPage; i++) {
            array[i]=(i+1) + "стр.";
        }
        return array;
    }

    public static String [][] generateChaptersByPages(String [] pages,int chaptersCount){
        if(nonNull(pages)){
            throw new RuntimeException("глав не должно быть меньше чем 1");
        }
        if(chaptersCount <= 0) {
            throw new RuntimeException("глав не должно быть меньше чем 1");
        }

        int size = pages.length/chaptersCount;
        String [][] chapters = new String[chaptersCount][size];
        for (int i = 0; i <size ; i++) {
            for (int j = i; j < size ; j++) {
                chapters[i][j] = pages[j+size*i];
            }
        }
        return chapters;
    }
}



