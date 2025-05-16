import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int[] array = Arrays.stream(my_string.replaceAll("[A-Za-z]", "").split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        int answer = 0;

        for (int i : array) {
            answer += i;
        }
        return answer;
    }
}