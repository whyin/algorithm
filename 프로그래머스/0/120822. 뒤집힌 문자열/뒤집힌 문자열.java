class Solution {
    public String solution(String my_string) {
        StringBuilder s = new StringBuilder(my_string);
        StringBuilder reversed = s.reverse();
        String string = reversed.toString();
        return string;
    }
}