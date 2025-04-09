public class Element {
    public static void main(String[] args){
        int[]nums={7,7,2,7,2,9};
        int ele=9;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i])
                index=i;
        }
        System.out.println(index);
    }
}
