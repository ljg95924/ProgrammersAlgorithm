package Hash;

import java.util.Arrays;

public class RetiredPlayer {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            String answer = "";
            for (int i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }
            return participant[completion.length + 1];
        }
    }
}
