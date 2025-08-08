class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int min = Integer.parseInt(split[0]);
        int max = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max;
    }
}