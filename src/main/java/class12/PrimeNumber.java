package class12;

public class PrimeNumber {
    String primeNumber(int number){
        if(number<=1){
            return "Not Prime";
        }else if(number<=3){
            return "Prime";
        }else if(number%2==0||number%3==0){
            return "Not Prime";
        }
        for (int i = 5; i*i<=number; i+=6) {
            if(number%i==0||number%(i+2)==0){
                return "Not Prime";
            }
        }
        return "Prime";

    }
}
