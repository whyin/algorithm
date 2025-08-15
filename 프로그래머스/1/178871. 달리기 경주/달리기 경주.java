import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] result = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        } 
        
        for (String name : callings) {
            int index = map.get(name); // 현재 몇등인지 
            if (index == 0 ) continue;
            
            String front = players[index - 1];
            
            players[index - 1] = name;
            players[index] = front;
            
            map.put(name, index - 1);
            map.put(front, index);
        }
        return players;
    }
}