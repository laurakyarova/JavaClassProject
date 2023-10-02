package class9;

public class FinSumOfAllNumbersInArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}};
        int sum=0;
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];
            }
        }
        System.out.println(sum);

    }
}
