package class16;

public class CatTester {
    public static void main(String[] args) {
        new Cat("Kitty",5,"Blue",
                "Russian Blue",5.12).printInfo();

        new Cat("Kitty",5,"Blue").printInfo();

        new Cat("Kitty",5,"Blue",
                "Russian Blue").printInfo();
    }
}
