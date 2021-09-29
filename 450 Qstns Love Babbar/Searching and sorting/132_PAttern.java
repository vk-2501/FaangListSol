//Approach 1: using 3 for loops
// Approach 2: using 2 for loops by fixiing left min in variable
// Approach 3: 1.Maintain an array containing min elements
//             2.Maintain a stack 
//               2.1 if my last element is greater than min[j] then only process further
//               2.2 If element in stack is lesser thn min[j] then keep popping until stck                          becomes empty
//               2.3 If at any time the peek of stack becomes lesser than nums[j] then                            return true
//               2.4 Dont forget to add element to the  stack


class Solution {
    public boolean find132pattern(int[] nums) {
        int a[]=new int[nums.length];
        a[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            a[i]=Math.min(a[i-1],nums[i]);
        }
        
        Stack<Integer> s=new Stack<>();
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]>a[j]){
                while(!s.isEmpty() && s.peek()<=a[j])
                    s.pop();
                if(!s.isEmpty() && s.peek()<nums[j])
                    return true;
                s.push(nums[j]);
            }
        }
        return false;
    }
}