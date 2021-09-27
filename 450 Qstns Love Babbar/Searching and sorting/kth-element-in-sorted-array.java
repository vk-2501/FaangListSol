// Solved using variables no extra space 
//TC--> O(n)


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=arr1[0];
        int j=arr2[0];
        while(i<n && j<m){
               if(arr1[i]<arr2[j]){
                   pq.add(arr1[i]);
                   i++;
                   
               }
               else{
                   pq.add(arr2[j]);
                   j++;
               }
        }
        
        while(i<n){
            
            pq.add(arr1[i]);
        }
        
        while(j<m){
            
            pq.add(arr2[j]);
        }
        
        int res=0;
        while(k!=0){
           res= pq.remove();
           k--;
        }
        return res;
    }
}
