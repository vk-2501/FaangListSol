class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int row=-1;
        int maxtillnow=0;
        for(int i=0;i<n;i++){
          int c=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    
                    c++;
                    if(maxtillnow<c){
                      maxtillnow=c;
                      row=i;
                    }
                 
                }
            }
        }
        return row;
}