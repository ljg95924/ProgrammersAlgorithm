package 월간코드챌린지.음양더하기;

public class Start {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution.solution(absolutes, signs));
    }

}
