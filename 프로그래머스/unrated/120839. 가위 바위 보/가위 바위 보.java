class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] rspArr = rsp.toCharArray();
        char[] winArr = new char[rspArr.length];
        for(int i = 0; i < rspArr.length; i++){
            if(rspArr[i] == '0') winArr[i] = '5';
            if(rspArr[i] == '2') winArr[i] = '0';
            if(rspArr[i] == '5') winArr[i] = '2';
        }
        
        answer = String.valueOf(winArr);
        
        return answer;
    }
}