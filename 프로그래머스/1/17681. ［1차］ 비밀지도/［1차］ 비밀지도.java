class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            int merged = arr1[i] | arr2[i];
            String step1 = String.format("%" + n + "s", Integer.toBinaryString(merged)); 
            
            String step2 = step1.replaceAll("0"," ").replaceAll("1", "#");
            arr[i] = step2;
        }
        return arr;
    }
}