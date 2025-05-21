import java.util.*;

class Solution {
    public String solution(String polynomial) {
        List<String> x = new ArrayList<>();
        List<Integer> n = new ArrayList<>();

        String[] split = polynomial.split(" ");

        for (String o : split) {
            if (o.contains("x")) {
                x.add(o);
            } else if (o.matches("^[0-9]+$")) {
                n.add(Integer.parseInt(o));
            }
        }

        int numX = 0;
        for (String s : x) {
            int len = s.length();
            if (len >= 2) {
                numX += Integer.parseInt(s.substring(0, len - 1));
            } else if (len == 1) {
                numX++;
            }
        }

        int num = 0;
        for (int integer : n) {
            num += integer;
        }

        if (numX != 0 && num != 0) {
            return (numX == 1 ? "" : numX) + "x" + " + " + num;
        } else if (numX == 0 && num != 0) {
            return "" + num;
        } else if (numX != 0 && num == 0) {
            return (numX == 1 ? "" : numX) + "x";
        } else {
            return "";
        }
    }
}