// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int c=0;
        for(int i=0;i<=n;i++){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}