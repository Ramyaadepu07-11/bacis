 class Array {
    public static void main(String[] args){
        int[] nums={4,6,5,8,7,6,7};
        int max=nums[0];
        for (int i=0;i<=nums.length-1;i++){
            if(max<nums[i])
                max=nums[i];
        }
        System.out.println(max);
    }
}
