package class4;

public class Test1 {
    public static void main(String[] args) {

        double mortgageRate=5.5;
        double mortgagePrice=350000;

        if(mortgageRate>4.5){
            System.out.println("Will not buy a house");
        }else{
            System.out.println("Consider buying");
            if(mortgagePrice>50000){
            System.out.println("Take a loan");
        }else{
            System.out.println("Pay cash");
        }}

    }
}
