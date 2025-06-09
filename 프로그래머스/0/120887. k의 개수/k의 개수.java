class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            String[] split = String.valueOf(l).split("");
            for (int m = 0; m < split.length; m++) {
                if (split[m].contains(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}