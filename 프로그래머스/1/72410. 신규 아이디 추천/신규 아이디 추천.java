class Solution {
    public String solution(String new_id) {
        String step1 = new_id.toLowerCase();
        System.out.println("step1 = " + step1);

        String step2 = step1.replaceAll("[^a-z0-9._-]", "");
        System.out.println("step2 = " + step2);

        String step3 = step2.replaceAll("\\.\\.+",".");
        System.out.println("step3 = " + step3);

        String step4 = step3;
        if (step4.startsWith(".")) {
            step4 = step3.replaceFirst(".", "");
        } else if (step3.endsWith(".")) {
            step4 = step3.substring(0, step3.length() - 1);
        }
        // String step5 = "";
        if (step4.isEmpty()) {
            step4 += "a";
        }
        System.out.println("step4 = " + step4);

        String step6 = step4;
        if (step4.length() >= 16) {
            step6 = step4.substring(0, 15);
        }
        if (step6.endsWith(".")) {
            step6 = step6.substring(0, step6.length() - 1);
        }
        System.out.println("step6 = " + step6);

        String step7 = step6;
        System.out.println("step7 = " + step7);
        String sub = step7.substring(step6.length()-1);

        while (step7.length() <= 2) {
            step7 += sub;
        }

        String answer = step7;
        System.out.println(answer);

        return answer;
    }
}