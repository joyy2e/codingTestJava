import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] eArr = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            eArr[i] = emergency[i];
        }
        Arrays.sort(eArr);
        for (int i = 0; i < eArr.length / 2; i++) {
            int temp = eArr[i];
            eArr[i] = eArr[eArr.length - 1 - i];
            eArr[eArr.length - 1 - i] = temp;
        }        
        for(int i = 0; i < eArr.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(eArr[i] == emergency[j]){
                    answer[j] = i + 1;
                }
            }
        }
        
        return answer;
    }
}