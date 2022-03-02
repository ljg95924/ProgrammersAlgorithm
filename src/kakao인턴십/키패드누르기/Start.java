package kakao인턴십.키패드누르기;

import java.lang.reflect.Array;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] data = {{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};
        String[] hands = {"right", "left", "right"};
        for (int i = 0; i < 3; i++) {
            System.out.println(solution.solution(data[i], hands[i]));
        }
    }
}
