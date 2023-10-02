package class3;

public class Test1 {
    public static void main(String[] args) {

        double expectedTemperature=36.6;
        double actualTemperature=30;

        if(expectedTemperature>actualTemperature){
            System.out.println("It`s cooler than expected, wear a jacket!");
        }else{
            System.out.println("It`s as warm as expected, enjoy your day!");
        }
    }
}
