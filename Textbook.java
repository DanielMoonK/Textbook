public class Textbook extends Book
{
    private int edition;
    
    public Textbook(String bookTitle, double bookPrice, int bookEdition){
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public int getEdition(){
        return edition;
    }

    public String getBookInfo(){
        return super.getTitle() + "-" + super.getPrice() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook comp){
        return this.getTitle().equals(comp.getTitle()) && comp.getEdition() <= this.getEdition();
    }
}