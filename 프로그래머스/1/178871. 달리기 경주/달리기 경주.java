import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 1. 맵으로 이름, 순위 저장
        // 2. callings과 말 이름 비교 후 순위 하나씩 밀기
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String name : callings) {
            int index = map.get(name); // 추월한 말 번호
            if(index == 0) continue;
            
            String front = players[index - 1];
            
            players[index - 1] = name;
            players[index] = front;
            
            map.put(name, index -1);
            map.put(front, index);
            
        }
        
        return players;
    }
}