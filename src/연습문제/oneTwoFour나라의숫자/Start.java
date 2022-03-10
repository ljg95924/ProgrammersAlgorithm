package 연습문제.oneTwoFour나라의숫자;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       for (int n : data
        ) {
            solution.solution(n);

        }
        solution.solution(8);
        solution.solution(9);
    }
}
