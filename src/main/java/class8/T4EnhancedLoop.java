package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {

        int [] nums={10,77,25,56,60,20};
        int largestnum=nums[2];
        for(int n:nums){
            if(n > largestnum && n%2==0) {
                    largestnum = n;
                }
            }

            System.out.println(largestnum);
    }}

