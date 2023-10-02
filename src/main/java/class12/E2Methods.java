package class12;

public class E2Methods {

    int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
    int multiply(int num1){
        int res=num1*10;
        return res;

    }
    int largestNum(int number1,int number2){
        int largest;
        if(number1>number2){
            largest=number1;
        }else{
            largest=number2;
        }
        return largest;
    }
}
