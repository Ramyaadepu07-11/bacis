public class Numberofelement {
    public static void main(String[] args){
        int[] nums={6,4,2,7,9,8,2,2};
        int n=2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n)
                count++;
        }
        System.out.println(count);
    }
}
