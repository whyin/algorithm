class Solution {
   public int[] solution(String my_string) {
       int[] answer = new int[52];
       
       for (char c : my_string.toCharArray()) {
           if ('A' <= c && c <= 'Z') {
               answer[c - 'A']++;
           } else if ('a' <= c && c <= 'z') {
               answer[26 + c - 'a']++;
           }
       }
       return answer;

    }
}