package kakaoBlindRecruitment.신규아이디추천;


public class Solution {
    public String solution(String new_id) {
        return stepSeven(stepSix(stepFive(stepFour(stepThree(stepTwo(stepOne(new_id)))))));
    }

    public String stepOne(String input_id) {
        return input_id.toLowerCase();
    }

    public String stepTwo(String input_id) {
        return input_id.replaceAll("[!\"#[$]%&\\(\\)\\{\\}@[*]:[+]<>,\\^~\\[\\]\\?\\/\\=]", "");
    }

    public String stepThree(String input_id) {
        if (input_id.contains("..")) {
            //input_id.replace("..", ".");
            return stepThree(input_id.replace("..", "."));
        }
        return input_id;
    }

    public String stepFour(String input_id) {
        if (input_id.startsWith(".")) return stepFour(input_id.substring(1));
        if (input_id.endsWith(".")) return stepFour(input_id.substring(0, input_id.length() - 1));
        return input_id;
    }

    public String stepFive(String input_id) {
        if (input_id.equals("")) return "a";
        return input_id;
    }

    public String stepSix(String input_id) {
        if (input_id.length() >= 16) {
            if (input_id.substring(0, 15).endsWith(".")) return input_id.substring(0, 14);
            return input_id.substring(0, 15);
        }
        return input_id;
    }

    public String stepSeven(String input_id) {
        //System.out.println(input_id.indexOf(input_id.length()-1));
        if (input_id.length() <= 2) return stepSeven(input_id + input_id.substring(input_id.length() - 1));
        return input_id;
    }
}

