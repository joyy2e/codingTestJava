class Solution {
    public int solution(int n, String control) {
        String[] c_arr = control.split("");
        for(String c : c_arr){
            if(c.equals("w")) n++;
            if(c.equals("s")) n--;
            if(c.equals("d")) n += 10;
            if(c.equals("a")) n -= 10;
        }
        return n;
    }
}