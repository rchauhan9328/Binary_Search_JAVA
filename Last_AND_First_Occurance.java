import java.util.ArrayList;
class Last_AND_First_Occurance{
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,3,3,4,4,5,5,6,7};
        int key=3;
        firstOccurance(arr,key);
        lastOccurance(arr,key);
        ArrayList<Integer> range=searchRange(arr, key);
        System.out.println("search range:" + range);
    }
    public static int firstOccurance(int[] arr,int key){
        int low=0;
        int hi=arr.length-1;
        int firstIdx=-1;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]==key){
                firstIdx=mid;
                hi=mid-1;    
            }
            else if(arr[mid]>key){
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return firstIdx;
    }
    public static int lastOccurance(int[] arr,int key){
        int low=0;
        int hi=arr.length-1;
        int lastIdx=-1;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]==key){
                lastIdx=mid;
                low=mid+1;
            }
            else if(arr[mid]>key){
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lastIdx;
    }
    public static ArrayList<Integer> searchRange(int[] arr,int key){
        ArrayList<Integer> result=new ArrayList<>();
        result.add(firstOccurance(arr,key));
        result.add(lastOccurance(arr,key));
        return result;
    }
}