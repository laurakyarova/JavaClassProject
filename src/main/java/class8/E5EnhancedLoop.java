package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {

        int [] nums={10,23,25,56,45,20};
        int largestnum=nums[0];
        for(int n:nums){

            if(n>largestnum) {
                largestnum = n;
            }}
            System.out.println(largestnum);
    }
}
