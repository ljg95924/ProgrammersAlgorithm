package 연습문제.탐욕법.체육복;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] lost = {{2, 4}, {2, 4},{3}};
        int[][] reserve = {{1, 3, 5}, {3},{1}};
        solution.solution(5, lost[0], reserve[0]);
        solution.solution(5, lost[1], reserve[1]);
        solution.solution(3, lost[2], reserve[2]);
    }
}
