class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
    
        for (int i = 0; i < n; i++) {
            
            int merged = arr1[i] | arr2[i];
            String step1 = String.format("%" + n + "s", Integer.toBinaryString(merged).replace(' ', '0'));
            
            String step2 = step1.replaceAll("1", "#").replaceAll("0", " ");
            
            answer[i] = step2;
        }
        return answer;
    }
}