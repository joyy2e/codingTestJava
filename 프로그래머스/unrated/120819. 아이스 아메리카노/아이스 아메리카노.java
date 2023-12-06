class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cost = 5500;    // 아메리카노 한 잔 값
        int cnt = 0;        // 살 수 있는 아메리카노의 갯수
        int change = 0;     // 남는 돈
            
        
        if(0 < money && money <= 1000000){
            cnt = money / cost;
            change = money - (cost * cnt);
        }
        
        answer[0] = cnt;
        answer[1] = change;
        
        
        return answer;
    }
}