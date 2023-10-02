package class16;

public class DogTaskTester {
    public static void main(String[] args) {
        //new DogTask("Tuzik",5); can`t call because it`s private
        new DogTask("Tuzik",5,"black").printInfo();
        new DogTask("Tuzik",6,"pink","German");
        new DogTask();
    }
}
