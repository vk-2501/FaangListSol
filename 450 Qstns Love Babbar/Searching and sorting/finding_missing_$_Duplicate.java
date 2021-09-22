class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] a=new int[2];
        for(int i=0;i<arr.length;i++){
            int val=Math.abs(arr[i]);
            if(arr[val-1]>0){
                arr[val-1]=-arr[val-1];
            }
            else{
               a[0]=val; 
            }
    }
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            a[1]=i+1;
        }
    }
    return a;
}
}
