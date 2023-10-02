package class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Batch 17 is greatest of all time");
            if(i%2==0){
                continue;//skip, start over
            }
            System.out.println("I was kidding");

        }
    }
}
