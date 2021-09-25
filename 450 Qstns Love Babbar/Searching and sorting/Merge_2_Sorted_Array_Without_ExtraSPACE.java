

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        for(int i=0;i<n;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                
                //The first element in second array
                //has been added randomly so left shift the elements and place them int their position
                int k=1;
                int fi=arr2[0];
                for(;k<m && arr2[k]<fi;k++){
                    arr2[k-1]=arr2[k];
                }
                
                arr2[k-1]=fi;
            }
        }
    }
}
