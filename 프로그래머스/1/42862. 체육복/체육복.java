import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> setLost = new HashSet<>();
        Set<Integer> setReserve = new HashSet<>();

        for (int l : lost) {
            setLost.add(l);
        }

        for (int r : reserve) {
            if (setLost.contains(r)) {
                setLost.remove(r);
            } else {
                setReserve.add(r);
            }
        }

        for (Integer l : setReserve) {
            if (setLost.contains(l - 1)) {
                setLost.remove(l - 1);
            } else if (setLost.contains(l + 1)) {
                setLost.remove(l + 1);
            }
        }

        return n - setLost.size();
    }
}