package class15;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String genre;

   public Book(String bookName1,String bookAuthor1){
       bookName=bookName1;
       bookAuthor=bookAuthor1;
   }
   public Book(String genre1){
       genre=genre1;
   }

    public static void main(String[] args) {
        new Book("Miramar","Paco Perez");
        new Book("Cooking Book");
    }
}
