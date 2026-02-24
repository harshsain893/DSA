public class maxNestingDepth {
    class Solution {
    public int maxDepth(String s) {
        int currentdepth = 0;
        int maxdepth = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                currentdepth++;
                maxdepth = Math.max(maxdepth, currentdepth);
            }
            else if(s.charAt(i) == ')'){
                currentdepth--;
            }
        }
        return maxdepth;
    }
}
}
