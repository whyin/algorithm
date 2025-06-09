class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String b : babbling) {
            String temp = b;
            for (String w : words) {
                if (temp.contains(w)) {
                    temp = temp.replace(w, " ");
                }
            }
            if (temp.replaceAll(" ", "").isEmpty()) {
                count++;
            }
        }
        int answer = 0;
        return count;
    }
}