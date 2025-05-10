class Solution {
    public int solution(String[] order) {
        int sum = 0;

        for (String s : order) {
            if (s.equals("iceamericano") |
                    s.equals("americanoice") |
                    s.equals("hotamericano") | 
                    s.equals("americanohot") | 
                    s.equals("americano") | 
                    s.equals("anything")) {
                sum += 4500;
            } else if (s.equals("icecafelatte") |
                    s.equals("cafelatteice") |
                    s.equals("hotcafelatte") |
                    s.equals("cafelattehot") |
                    s.equals("cafelatte")) {
                sum += 5000;
            }
        }
        return sum;
    }
}