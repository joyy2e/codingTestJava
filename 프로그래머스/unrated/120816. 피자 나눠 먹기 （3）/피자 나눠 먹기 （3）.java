class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(2 <= slice && slice <= 10 && 1 <= n && n <= 100){
            if(n % slice == 0){
                answer = n / slice;
            }else if(n % slice > 0){
                answer = (n / slice) + 1;
            }
        }
        return answer;
    }
}