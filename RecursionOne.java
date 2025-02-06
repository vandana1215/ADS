
    //Recursion i sa method in which function calls itself
    // to solve a smaller instance of the same problem


    // types of recursion 
    // 1. direct recursion: a function calls itself
    // 2.INdirect recursion: in this a functions calls another function
    // 3. Tail recusrion
    // 4.Head recursion

    //Ques: Find the positon of the elemnet in sorted array

public class RecursionOne{
    public static int BSearch(int[] arr,int target,int left ,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BSearch(arr,target,left,mid-1);
        }else{
            return BSearch(arr,target,mid+1,right);
        }
    }
    public static void main(String[] args){
        int []arr={1,2,3,44,67,45};
        int target= 44;
        int index=BSearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }
}