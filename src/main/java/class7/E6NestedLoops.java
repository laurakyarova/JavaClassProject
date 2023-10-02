package class7;

public class E6NestedLoops {
    public static void main(String[] args) {

      /*  for (int i = 5; i >=0; i--) {

            for (int j = i; j <5; j++) {
                System.out.print("*");
                
            }
            System.out.println();*/
        int rows = 7;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }}




