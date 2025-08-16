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
            String bonus = m.group(2);
            String option = m.group(3);
            rounds.add(new String[]{num, bonus, option});
        }
        
        for (int i = 0; i < rounds.size(); i++) {
            String[] round = rounds.get(i);
            
            int num = 0;
            int a = Integer.parseInt(round[0]);
            
            if (round[1].equals("S")) {
                num += a;
            } else if (round[1].equals("D")) {
                num += a * a;
            } else if (round[1].equals("T")) {
                num += a * a * a;
            }
            
            if (round[2].equals("*")) {
                num *= 2;
                if (i > 0) {
                    result[i-1] *= 2; 
                }
            } else if (round[2].equals("#")) {
                num = -num;
            }
            
            result[i] = num;
            
        }
        
        return result[0] + result[1] + result[2];
    }
}