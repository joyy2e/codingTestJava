import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
         String[] keys = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--"
             ,"-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        for (int i=0; i<keys.length; i++){
            map.put(keys[i],(char)(97+i));
        }
        
        String[] letter_split = letter.split(" "); 
        
        for (int i=0; i<letter_split.length; i++){
            char ch = map.get(letter_split[i]);
            answer+=ch;
        }
        
        
        return answer;
    }
}