class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] != 0 && dot[1] != 0){
            if(dot[0] > 0 && dot[1] > 0){ 
            // x와 y가 모두 양수
            answer = 1;            
            }else if(dot[0] < 0 && dot[1] > 0){ 
                // x가 음수, y가 양수
                answer = 2;            
            }else if(dot[0] < 0 && dot[1] < 0){ 
                // x와 y가 모두 음수
                answer = 3;            
            }else if(dot[0] > 0 && dot[1] < 0){ 
                // x가 양수, y가 음수
                answer = 4;            
            }
        }
        
        
        return answer;
    }
}