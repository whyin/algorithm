import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> spellList = Arrays.asList(spell);  // contains 용도

    for (String word : dic) {
        if (word.length() != spell.length) continue;  // ❗️길이 먼저 필터링

        String[] letters = word.split("");
        List<String> lettersList = new ArrayList<>(Arrays.asList(letters));

        boolean allMatched = true;
        for (String s : spell) {
            if (!lettersList.contains(s)) {
                allMatched = false;
                break;
            } else {
                lettersList.remove(s); // 중복 방지: 한 번 매칭된 글자는 제거
            }
        }

        if (allMatched) return 1;
    }

    return 2;
    }
}