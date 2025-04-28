class Solution {
    public String solution(String my_string, int[] indices) {
        String[] myString = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            myString[indices[i]] = "";
        }
        return String.join("", myString);
    }
}