public class Min {
    public static void main(String[] args){
        int[] nums={7,3,8,7,8,1,2};
        int min=nums[0];
        for(int i=0;i<=nums.length-1;i++) {
            if (min > nums[i])
                min = nums[i];
        }
        System.out.println(min);

    }
}
