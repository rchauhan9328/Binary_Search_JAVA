class Mountain_Array {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        int x = PeakArray(arr);
        System.out.println("Mountain Array :"+x);
    }
    public static int PeakArray(int[] arr){
        int low=1;
        int hi=arr.length-2;
        int peak=0;
        while(low<=hi){
            int mid=(hi+low)/2;
            if( arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                peak=arr[mid];
                return peak;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;

            }
            else{
                hi=mid-1;
            }
        }
        return 0;
    }
}
