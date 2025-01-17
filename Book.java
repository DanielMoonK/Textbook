public class Book{
    private String title;
    private double price;

    public Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getBookInfo(){
        return title + "-" + price;
    }
}