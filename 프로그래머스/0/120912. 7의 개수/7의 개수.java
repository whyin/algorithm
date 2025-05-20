class Solution {
    public int solution(int[] array) {
       int answer = 0;
            
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
                    char[] charArray = String.valueOf(array[i]).toCharArray();
                    if (charArray[j] == '7') {
                        answer ++;
                    }
                    
                }
            }
            return answer;
    }
}