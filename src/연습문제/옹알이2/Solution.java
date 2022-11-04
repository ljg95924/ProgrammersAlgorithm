package 연습문제.옹알이2;

class Solution {
    public int solution(String[] babbling) {
        // "aya", "ye", "woo", "ma"
        int answer = 0;
        String[] compareWords = {"aya", "ye", "woo", "ma"};
        for (String word : babbling
        ) {
            String temp = word;
            for (String compareWord : compareWords
            ) {
                if(temp.contains(compareWord+compareWord)) break;

                temp = temp.replace(compareWord, "1");
                if(temp.replaceAll("1","").equals("")) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}