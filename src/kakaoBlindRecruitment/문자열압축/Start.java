package kakaoBlindRecruitment.문자열압축;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd","aaaaaaaaaaaabcd","xxxxxxxxxxyyy","bbaabaaaab","zzzbbabbabba","aaaaaaaaaaaabcd"};
        for (String word : words
        ) {
            System.out.println(solution.solution(word));

        }
    }
}
