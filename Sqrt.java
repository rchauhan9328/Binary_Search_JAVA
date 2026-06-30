class Sqrt {
    public static void main(String[] args) {
        int n=20;
        int y=Sqrtroot(n);
        System.out.println("Sqrt is :"+y);
    }
    public static int  Sqrtroot(int n){
        int root=0;
        for(int i=1;i<n;i++){
            // root=i;
            if(i*i>n) break;
            root=i;
        }
        return root;
    }
}
