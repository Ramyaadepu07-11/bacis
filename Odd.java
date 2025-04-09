public class Odd {
    public static void main(String[] args){
        int[] nums={2,5,4,2,2,8,2,9,5,3};
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] % 2 != 0)
                count++;
        }

        System.out.println(count);
    }
}
