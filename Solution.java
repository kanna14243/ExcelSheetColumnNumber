public class Solution {
    public int titleToNumber(String s) {
        int i=1;
        int j=0;
        int res=0;
        while(j<s.length()){
            int k = s.charAt(s.length()-1-j)-'A'+1;
            if(i==1){
                res+=k;
            }
            else{
                res+=i*k;
            }
            i*=26;
            j++;
        }
        return res;
    }
}
