public class Solution {
    public static void toBinary(int n) {
        // code here
        String res=new String();
        while(n!=0){
            res=(n%2)+res;
            n=n/2;
        }
        System.out.print(res);
    }
}
