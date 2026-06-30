import java.util.Scanner;
class First_Occurance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,1,2,3,2,6,2,5};
        System.out.println("Enter a number key :");
        int key =sc.nextInt();
        int x=binarysearch(arr,key );
        System.out.println(x);
    }
    static  int binarysearch(int[] arr,int key ){
        int low=0;
        int hi=arr.length-1;
        int idx =-1;
        while (low<hi){
            int mid=(low+hi)/2;
            if(arr[mid]>key){
                hi=mid-1;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else {
                idx=mid;
                hi=mid-1;
            }
        }
        return  idx;
    } 
}