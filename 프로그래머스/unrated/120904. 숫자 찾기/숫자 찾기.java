class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        int[] numArr = new int[(Integer.toString(num)).length()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt((Integer.toString(num)).split("")[i]);
        }
        
        
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == k){
                System.out.println(numArr[i]);
                answer = (i + 1);
                break;
            }else{
                answer = -1;
            }
        }
        
        return answer;
    }
}