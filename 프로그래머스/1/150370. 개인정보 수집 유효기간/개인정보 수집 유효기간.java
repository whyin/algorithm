import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        int todayInt = today(today);

        Map<String, Integer> termsMap = new HashMap<>();

        //termsMap: "A" , 6
        for (String term : terms) {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        }


        // A 비교 -> 더하기 -> 투데이랑 비교 -> 오버된 날짜 시 list에 저장
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String key = split[0];
            String value = split[1];

            int index = i;

            int plusMonth = 0;

            if (termsMap.containsKey(value)) {
                plusMonth = termsMap.get(value);
            }

            int plusDate = today(key) + (plusMonth * 28) - 1;

            if (plusDate < todayInt) {
                resultList.add(index + 1);
            }
        }

        resultList.sort(Integer::compareTo);

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    int today(String date) {
        String[] split = date.split("\\.");
        int y = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int d = Integer.parseInt(split[2]);

        return (y * 12 * 28) + (m * 28) + d;
    }
}