package class16;

public class PersonTester2 {
    public static void main(String[] args) {

        new Person2("Laura",37,
                145,'F').printInfo();
        new Person2("Ellie",1,
                27,'F',120000,
                "black").printInfo();
        new Person2().printInfo();
    }
}
