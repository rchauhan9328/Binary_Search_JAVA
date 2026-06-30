//import java.util.*;
class Last_Occurance{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int[] arr={ 1,3,5,5,5,67,123,125};
        int x=5;
        int res =LastOccurance(arr,x);
        System.out.println("the last occurance is "+res);
    }  
    static int LastOccurance(int[] arr,int x){
        int low=0;
        int hi=arr.length-1;
        int idx=-1;
        while(low<=hi){
            int mid=(hi+low)/2;
            if(arr[mid]==x){
                idx=mid;
                low=mid+1;
                //return mid ;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return idx;
    }
    
}