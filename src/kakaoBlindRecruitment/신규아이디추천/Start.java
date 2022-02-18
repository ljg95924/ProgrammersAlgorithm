package kakaoBlindRecruitment.신규아이디추천;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p"};
        for (String str : strings
        ) {
            System.out.println(solution.solution(str));
        }
    }
}
