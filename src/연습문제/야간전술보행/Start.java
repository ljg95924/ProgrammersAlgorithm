package 연습문제.야간전술보행;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int distance = 10;
        int [][] scope = {{3, 4}, {5, 8}};
        int [][] times = {{2, 5}, {4, 3}};
        solution.solution(distance, scope, times);
    }
}
