import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array); // 오름차순 정렬
        
        int[] distinctArr = Arrays.stream(array).distinct().toArray(); // 중복제거
        int[] cntArr = new int[distinctArr.length]; // 중복제거
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < distinctArr.length; j++){
                if(array[i] == distinctArr[j]){
                    cntArr[j]++;
                }
            }
        }
        
        int max = cntArr[0];
        int maxIndex = 0;
        for(int k = 0; k < cntArr.length; k++){
            if(max < cntArr[k]){
                max = cntArr[k];
                maxIndex = k;
            }
        }
        
        int cnt = 0;
        for(int x = 0; x < cntArr.length; x++){
            if(cntArr[x] == max){
                cnt++;
            }
        }
        
        if(cnt > 1){
            answer = -1;
        }else{
            answer = distinctArr[maxIndex];
        }
        
        
        return answer;
    }
}