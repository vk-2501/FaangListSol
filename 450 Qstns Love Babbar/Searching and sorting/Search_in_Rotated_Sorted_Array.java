class Solution {
    public int search(int[] nums, int target) {
       //Binary Search 
        //Approach is based on that along pivot element one part is sorted
        int l=0,h=nums.length-1;
       
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
               return mid;
            }
            
            //here we are checking since element is not at middle so we are checking whether it lies in sorted part and in the range of that sorted part if so then we will move our high pointer towards left.Otherwise we will move left to mid+1
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && nums[mid]>target)
                 h=mid-1;
                else{
                    l=mid+1;
                }
             }
            
            //Checking for other sorted part which lies on right hand side.If element within its range then take low otherwise move high.
            else if(nums[mid]<=nums[h]){
                if(target>nums[mid] && nums[h]>=target){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            
            
        }
        return -1;
        
    }
}
