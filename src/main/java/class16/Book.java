package class16;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    private String name;
    private String genre;

    public Book(String name, String genre){
        this.name=name;
        this.genre=genre;
        System.out.println(name+" "+genre);

    }
    public Book(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        new Book("Dear John","Novel");
        new Book("Dear John");
    }


}
