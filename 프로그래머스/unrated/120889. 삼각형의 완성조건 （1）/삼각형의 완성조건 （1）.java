import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        System.out.println(sides[0]);
        System.out.println(sides[1]);
        System.out.println(sides[2]);
        
        if(sides[0] + sides[1] > sides[2]){
            answer = 1; // 만들 수 있을 때
        } else{
            answer = 2; // 만들 수 없을 때
        }
        
        return answer;
    }
}