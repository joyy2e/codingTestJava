import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int middleIndex = 0;
        Arrays.sort(array);
        if(array.length % 2 != 0){
            middleIndex = array.length / 2;
            answer = array[middleIndex];
        }
        return answer;
    }
}