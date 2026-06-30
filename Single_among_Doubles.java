//import java.util.Scanner;
// WAP : Single_among_Doubles in Sorted array
class Single_among_Doubles {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int[] arr={1,1,2,2,3,3,4,5,5,6,6,7,7};
        int y =FindOnce(arr);
        System.out.println("Find Once Single element in Array is :"+y);
    }
    public static int FindOnce(int[] arr){
        int low=0;
        int n= arr.length;
        int hi=arr.length-1;
        if(arr.length==1) return arr[0];
        while(low<=hi){
            int mid=(hi+low)/2;
            if((arr[mid-1]!=arr[mid]) && (arr[mid]!=arr[mid+1])) return arr[mid];
            int f=mid,s=mid;
            
            if(arr[mid-1]==arr[mid]) {
                f=mid-1;
                
            }
            else{
                //arr[mid+1]==arr[mid];
                //f=mid;
                s=mid+1;
            }
            int Left_Count=f-low;
            int Rigth_Count=hi-s;
            if(Left_Count%2==0) low=s+1;
            else hi=s-1;
        }
        return  0;
    }
}
