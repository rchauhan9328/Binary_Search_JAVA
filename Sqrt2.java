import java.util.*;
class Sqrt2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        //int n=20;
        //int[] arr =new int[n];
        int x=floarSqrt(n);
        System.out.println("FloarSqrt is your number is :" +x);
    }
    public static int floarSqrt(int n){
        int hi=n;
        int low=0;
        while(low<=hi){
            int mid=(hi+low)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                hi=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return  hi;
    }
}
