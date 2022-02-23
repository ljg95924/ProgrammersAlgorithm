package stack.프린터;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] priorities = {{2, 1, 3, 2}, {1, 1, 9, 1, 1, 1}};
        int[] location = {2, 0};
        System.out.println("정답:" + solution.solution(priorities[0], location[0]));
        System.out.println("정답:" + solution.solution(priorities[1], location[1]));
    }
}
