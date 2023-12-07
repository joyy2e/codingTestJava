class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String item1 : s1){
            for(String item2: s2){
                if(item1.equals(item2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}