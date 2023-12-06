import java.util.List;
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] strArray = Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);
        
       for (String str : strArray) {
            for (int i = 0; i < str.length(); i++) {
                if (String.valueOf(str.charAt(i)).equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}