public class Reverse {
    public static void main(String[] args){
        int[] oldArray={5,4,6,7,8};
        int[] newArray=new int[oldArray.length];
        int lastIndex=oldArray.length-1;
        for(int i=lastIndex;i>=0;i--){
            int val=oldArray[i];
            newArray[lastIndex-i]=val;
            System.out.println(val);
        }

    }
}
