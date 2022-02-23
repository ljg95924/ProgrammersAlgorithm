package stack.기능개발;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] progresses = {{93, 30, 55}, {95, 90, 99, 99, 80, 99}};
        int[][] speeds = {{1, 30, 5}, {1, 1, 1, 1, 1, 1}};

        System.out.println(Arrays.toString(solution.solution(progresses[0], speeds[0])));
        System.out.println(Arrays.toString(solution.solution(progresses[1], speeds[1])));
    }
}
