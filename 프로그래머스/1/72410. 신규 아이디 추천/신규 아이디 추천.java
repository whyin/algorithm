class Solution {
    public String solution(String new_id) {
        String s = new_id.toLowerCase()
                .replaceAll("[^a-z0-9._-]", "")  
                .replaceAll("\\.+", ".")
                .replaceAll("^\\.|\\.$", "");     
     
        if (s.isEmpty()) s = "a";                

        if (s.length() >= 16) s = s.substring(0, 15); 
        s = s.replaceAll("\\.$", "");            
        if (s.isEmpty()) s = "a";                

        while (s.length() < 3) {                 
            s += s.charAt(s.length() - 1);
        }
        return s;
    }
}