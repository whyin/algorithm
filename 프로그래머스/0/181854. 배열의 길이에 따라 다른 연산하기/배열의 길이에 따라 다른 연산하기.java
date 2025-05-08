class Solution {
   public int[] solution(int[] arr, int n) {
        //짝수 1 / 홀수 -1
        int len = (arr.length % 2 == 0) ? 1 : -1;

        if (len == 1) { //짝수 번째에
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] += n;
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] += n;
            }
        }
        return arr;
    }
}