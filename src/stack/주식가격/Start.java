package stack.주식가격;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 2, 3})));
        System.out.println(Arrays.toString(solution.solution(new int[]{5,4,3,2,1})));
        System.out.println(Arrays.toString(solution.solution(new int[]{5,3,1,1,1})));
        System.out.println(Arrays.toString(solution.solution(new int[]{5,3,7,2,1})));
    }
}
