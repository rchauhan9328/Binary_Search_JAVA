class Floor_in_A_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={1,2,8,10,10,12,12,19};
        //int x=5;
        int x=-1;
        int x2=0;
        int y =Floar_Element_Array(arr,x);
        //int[] arr1={1,2,8,10,10,12,19};
        //int[] arr2={}
        System.out.println("Floor sorted Array is :"+y);
    }
    static int Floar_Element_Array(int[] arr,int x){
        int low=0;
        int hi=arr.length-1;
        int idx=-1;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]>x){
                hi=mid-1;
            }
            else{
                idx=mid;
                low=mid+1;
                //return idx;
            }
        }
        return idx;
    }
}
