class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length() / n;
                String[] substring = new String[my_str.length() % n == 0 ? size : size + 1];

        int end = 0;

        for (int i = 0, j = 0; i < size * n; i += n, j++) {
            substring[j] = my_str.substring(i, i + n);

            end = i + n;
        }
        if (end != my_str.length()) {
            substring[size] = my_str.substring(end);
        }

        return substring;
    }
}