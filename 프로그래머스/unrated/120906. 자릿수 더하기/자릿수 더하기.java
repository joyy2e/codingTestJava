class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] numberArr = Integer.toString(n).split("");
        for(String num : numberArr){
            answer += Integer.parseInt(num);
        }
        
        
        return answer;
    }
}