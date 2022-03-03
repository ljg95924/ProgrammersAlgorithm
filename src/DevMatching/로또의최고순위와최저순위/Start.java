package DevMatching.로또의최고순위와최저순위;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums={31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution.solution(lottos,win_nums)));
    }

}
