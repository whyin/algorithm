import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String cipher, int code) {
         String answer = "";
        List<String> list = new ArrayList<>();
        for (int i = code -1; i < cipher.length(); i += code) {
            list.add(String.valueOf(cipher.charAt(i)));
        }
        for (String s : list) {
            answer += s;
        }
        return answer;
    }
}