class Solution {
    public String solution(String s) {     
        
        String answer = "";
        
        String[] arr = s.split(" ", -1);
        
        for (String str : arr) {
            if (str.length() > 0) {
                str = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
            }
            answer += str + " ";
        }
        return answer.substring(0, answer.length()-1);
    }
}