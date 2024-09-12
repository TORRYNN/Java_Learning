public class program1 {
    public static void main(String[] args) {
        // Using the full constructor
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 15.99);

        // Using the overloaded constructor
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Displaying book information
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}

class Book{
    String title,author;
    int year;
    double price;
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = 2000; // Default value
        this.price = 10.0;
    }

    Book(String title,String author,int year,double price){
         this.title =title ;
         this.author =author ;
         this.year =year ;
         this.price =price ;
    }
    public  void displayBookInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        System.out.println(price);
    }
}
