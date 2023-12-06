class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = new String[my_string.length()];
        String[] reverseArr = new String[my_string.length()];
        
        strArr = my_string.split("");
        
        for(int i = 0; i < strArr.length; i++){
            reverseArr[i] = strArr[(strArr.length - 1) - i];
        }
        

        answer = String.join("", reverseArr);
        
        return answer;
    }
}