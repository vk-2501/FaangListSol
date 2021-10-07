 Check if Number is a Sum of Powers of Three

Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.

An integer y is a power of three if there exists an integer x such that y == 3x.

Example 1:

Input: n = 12
Output: true
Explanation: 12 = 31 + 32

Example 2:

Input: n = 91
Output: true
Explanation: 91 = 30 + 32 + 34

Example 3:

Input: n = 21
Output: false

Constraints:

1 <= n <= 107

APPROACH :- 
 Since n can be very large till 10^7 ,so 10^7 ~ 3^14

so start iterating from 14 and if the number-power of 3 is greater than 0 then decrement n;
if n becomes 0 return true 
else false

CODE:-
class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i=14;i>=0;i--){
            int nop=(int)(Math.pow(3,i));
            if(n-nop>=0) n=n-nop;
            if(n==0)
                return true;
        }
        return false;
    }
}