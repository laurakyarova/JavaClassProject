package class4;

public class Donor {
    public static void main(String[] args) {

        int age=18;
        double weight=110;

        if(age==18){
            System.out.println("Eligible");
            if(weight>110){
                System.out.println("Eligible");
            }else{
                System.out.println("Not Eligible");
            }
        }

    }
}
