class Solution {
    public int solution(String my_string) {
        String[] opArr = new String[3];
        opArr = my_string.split(" ");        
        
        int answer = Integer.parseInt(opArr[0]);
        
        for(int i = 1; i < opArr.length - 1; i++){
            if(opArr[i].equals("+")){
                answer += Integer.parseInt(opArr[i + 1]);
            } else if(opArr[i].equals("-")){
                answer -= Integer.parseInt(opArr[i + 1]);
            }
        }
        
        return answer;
    }
}