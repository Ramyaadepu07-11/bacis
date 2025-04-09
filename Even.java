public class Even {
    public static void main(String[] args){
        int[] nums={7,9,7,7,7,8,9,8,3,4,4,2};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                count++;
        }
        System.out.println(count);
    }
}
