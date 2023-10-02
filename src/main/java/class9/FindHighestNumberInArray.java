package class9;

public class FindHighestNumberInArray {
    public static void main(String[] args) {

        int [] numbers={56,9,25,454,87,32,11,3};
        int highestNumber=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>highestNumber){
                highestNumber=numbers[i];
                System.out.println(highestNumber);
            }

        }
    }
}
