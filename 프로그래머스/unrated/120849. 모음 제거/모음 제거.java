class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < vowels.length; i++){
            my_string = my_string.replace(vowels[i], "");
        }
                
        
        answer = my_string;
        
        
        
        return answer;
    }
}