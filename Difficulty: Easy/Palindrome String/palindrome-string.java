class Solution {
    boolean isPalindrome(String s) {
        // code here
        int l=0;
       int right=s.length()-1;
        while(l<=right){
            if(s.charAt(l)!=s.charAt(right)){
                return false;
                
            }
            l++;
            right--;
        }
        return true;
    }
}