import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x", -1);

        String[] filtered = Arrays.stream(split)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        Arrays.sort(filtered);
        return filtered;
    }
}