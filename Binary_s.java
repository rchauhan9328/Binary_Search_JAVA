// import java.utial.Scanner;
import java.util.Scanner;
class Binary_s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enetr a elment in Array :");
            arr[i]=sc.nextInt();
        }
        System.out.print("Emetr a Key value :");
        int key =sc.nextInt();
        int x=Find_key(arr,key);
        if(x==-1){
            System.out.println("key is not present in array ");

        }
        else{
            System.out.println("key values index is: " +x);
        }
    }
    public static int Find_key(int[] arr,int key){
        int low=0;
        int hi=arr.length-1;
        int idx=-1;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                low =mid+1;

            }
            else{
                //idx=mid;
                hi=mid-1;
            }
        }
        return idx;
    }
    
}
