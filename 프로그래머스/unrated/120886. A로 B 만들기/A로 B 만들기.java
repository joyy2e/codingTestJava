import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        String strB = new String(b);
        String strA = new String(a);
        
        
        if(strB.equals(strA)) answer = 1;
        if(!strB.equals(strA)) answer = 0;
        
        return answer;
    }
}