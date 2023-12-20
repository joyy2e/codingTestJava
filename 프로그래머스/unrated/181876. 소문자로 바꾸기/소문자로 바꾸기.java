import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
            .map(s -> Character.toLowerCase(s.charAt(0)))
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}