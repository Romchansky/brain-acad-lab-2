package ua.zp.brainacad;

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
    public int[] sheetBook;

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

    public int[] sheetBook(int numberOfPage) {
        sheetBook = new int[numberOfPage];
        for (int i = 0; i < sheetBook.length; i++) {
            sheetBook[i]=(i+1);
        }
        return sheetBook;
    }
}



