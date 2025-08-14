// Single(S), Double(D), Triple(T) 
import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int[] result = new int[3];
        
        Pattern p = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher m = p.matcher(dartResult);
        List<String[]> rounds = new ArrayList<>();
        
        while(m.find()) {
            String num = m.group(1);
            String pow = m.group(2);
            String opt = m.group(3);
            rounds.add(new String[]{num, pow, opt});
        }
        
        for (int i = 0; i < rounds.size(); i++) {
            String[] r = rounds.get(i);
            
            int num = 0;
            int a = Integer.parseInt(r[0]);
            if (r[1].equals("S")) {
                num += a;
            } else if (r[1].equals("D")) {
                num += a * a;
            } else if (r[1].equals("T")) {
                num += a * a * a;
            }
            
            
            if (r[2].equals("*")) {
                num *= 2;
                if (i > 0) {
                    result[i - 1] *= 2;
                }
            } else if (r[2].equals("#")) {
                num = -num;
            }
            result[i] = num;
        }
        return result[0] + result[1] + result[2];
    }
}