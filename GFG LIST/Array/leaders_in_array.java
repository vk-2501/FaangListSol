LEADERS IN ARRAY

 An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

BRUTE FORCE: Run two for loops check for every element if you find element smaller than element ahead of it then break the loop.

TC-->O(n*n)

OPTMISED:
1. Keep track of max element from right.
2. Since right element will always be max so add it to arraylist.
3. Start loopin from second last element if you find any max ele then update.
4.Reverse the arraylist to get desired result


TC--> 0(n)
CODE:
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a=new ArrayList<>();
        int max=arr[n-1];
        a.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                a.add(max);
            }
            
        }
        Collections.reverse(a);
        return a ;
    }
}

