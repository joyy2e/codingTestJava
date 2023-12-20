class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result1 = 1;
        int result2 = 0;
        for(int num : num_list){
            result1 *= num;
            result2 += num;
        }
        result2 *= result2; 
        return answer = result1 < result2 ? 1 : 0;
    }
}