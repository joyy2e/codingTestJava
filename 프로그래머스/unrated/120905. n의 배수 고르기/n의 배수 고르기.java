import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> modifiedList = new ArrayList<>();
        
        for(int num : numlist){
            if(num % n == 0){
                modifiedList.add(num);
            }
        }
        
        answer = modifiedList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}