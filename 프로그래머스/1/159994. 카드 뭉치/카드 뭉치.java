class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0;
        int n1 = cards1.length, n2 = cards2.length;

        for (String g : goal) {
            boolean used = false;
            
            if (i < n1 && g.equals(cards1[i])) {
                i++;
                used = true;
            }
            if (j < n2 && g.equals(cards2[j])) {
                j++;
                used = true;
            }
            if(!used) {
                return "No";
            }
        }
        
        return "Yes";
    }
}