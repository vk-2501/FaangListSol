Given an array arr[] of distinct integers of size N and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.


Example 1:


Input: N = 4, sum = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3).









//Approach
//1. Sort the array
//2. Now keep i at 0 ,j=i+1 and k at n-1
//3. Take sum of values then if sum is greater than target sum decrement k as
//   lower values will be on left
//4. If sum is less then this implies since from maximum element it is giving smaller sum so 
//   the elements lying towards its left will also be less. So take ans=ans+(k-j)
class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        long ans=0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]>=sum)
                k--;
                else{
                    ans+=(long)(k-j);
                    j++;
                }
            }
        }
        return ans;
    }
}

