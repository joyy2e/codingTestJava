import java.util.Arrays;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] arr = new String[my_string.length()];
        arr = my_string.split("");
                
        for(String str : arr){
            for(int i = 1; i <= n; i++){
                answer += str;
            }
        }
        
        return answer;
    }
}