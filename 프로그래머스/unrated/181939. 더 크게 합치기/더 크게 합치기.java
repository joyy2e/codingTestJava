class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result1 = a + "" + b;
        String result2 = b + "" + a;
        answer = Math.max(Integer.parseInt(result1), Integer.parseInt(result2));
        return answer;
    }
}