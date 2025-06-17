class Solution {
    public boolean solution(int x) {
        String[] s = String.valueOf(x).split("");
        int temp = 0;

        for (String n: s) {
            temp += Integer.parseInt(n);

        }

        return x % temp == 0;
    }
}