class Solution {
     public String[] solution(String myStr) {
        String[] answer = {};

        String[] split = myStr.replaceAll("[abc]", " ").trim().split("\\s+");

        if (split.length == 1 && split[0].isEmpty()) {
            return new String[]{"EMPTY"};
        }
        return split;
    }
}