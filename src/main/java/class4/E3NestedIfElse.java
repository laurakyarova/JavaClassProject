package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {

        double accountBalance=70000;

        if(accountBalance>28000){
            System.out.println("We can afford a normal Toyota");
            if(accountBalance>50000){
                System.out.println("We can afford Luxury cars as well");
            }
        }else {
            System.out.println("We need to save more");

        }
        }
}
