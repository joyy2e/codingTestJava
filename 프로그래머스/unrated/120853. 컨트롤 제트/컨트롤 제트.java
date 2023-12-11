import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Z")){
                arr[i - 1] = "*";
            }
        }
        
        List<String> modifiedArr = new ArrayList<>();
        
        for(String item : arr){
            if(!item.equals("Z") && !item.equals("*")){
                modifiedArr.add(item);
            }
        }
        
        for(int j = 0; j < modifiedArr.size(); j++){
            answer += Integer.parseInt(modifiedArr.get(j));
        }
        
        
        return answer;
    }
}