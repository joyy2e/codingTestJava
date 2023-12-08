class Solution {
    public String solution(int age) {
        String answer = "";
        String[] OriginalAge = (String.valueOf(age)).split("");
        String[] strangeAge = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for(int i = 0; i < OriginalAge.length; i++){
            answer += strangeAge[Integer.parseInt(OriginalAge[i])];
        }
        return answer;
    }
}