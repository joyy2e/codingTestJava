import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n) {
        int length = 0;
        if(n % 2 == 0) length = n / 2;
        if(n % 2 != 0) length = n / 2 + 1;
        
        int[] answer = new int[length];
        List<Integer> array = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            array.add(i + 1);
        }
        
        array = array.stream().filter(item -> item % 2 != 0).collect(Collectors.toList());
        
        for(int i = 0; i < array.size(); i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}