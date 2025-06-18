class Solution {
    public String solution(String[] seoul) {
        String index = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                index = "" + i;
                break;
            }
        }
        
        return "김서방은 "+ index +"에 있다";
    }
}