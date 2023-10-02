package class8;

public class T8EnhancedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("outer loop");
            for (int j = 0; j < 5; j++) {

                if(j==2) {
                    break;
                }
                System.out.println("Inner loop");
            }

        }




    }}

