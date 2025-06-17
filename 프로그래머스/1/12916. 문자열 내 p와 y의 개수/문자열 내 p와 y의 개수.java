class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");

        int Pp = 0;
        int Ss = 0;

         for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("P")) {
                Pp++;
            } else if (arr[i].equalsIgnoreCase("Y")) {
                Ss++;
            } else{
                continue;
            }
        }
        return Pp == Ss;
    }
}