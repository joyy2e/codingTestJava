class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char cAlp = alp.charAt(0);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == (char) cAlp){
                answer += Character.toUpperCase(arr[i]);
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}