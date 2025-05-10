import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] picture, int k) {

        List<String> result = new ArrayList<>();

        for (String s : picture) {
            StringBuilder sb = new StringBuilder();

            //가로 k배 늘리기
            for (char ch : s.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(ch);
                }
            }

            //세로로 늘리기
            for (int i = 0; i < k; i++) {
                result.add(sb.toString());
            }

        }
        return result;
    }
}