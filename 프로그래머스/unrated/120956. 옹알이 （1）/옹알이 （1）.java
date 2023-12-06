
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleArr = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
           for(int j = 0; j < possibleArr.length; j++){
               babbling[i] = babbling[i].replace(possibleArr[j], "*");
           }
        }
        
        for(String word : babbling){
            word = word.replaceAll("\\*", "");
           if(word.trim().equals("")){
               answer++;
           }
        }
        
        return answer;
    }
}