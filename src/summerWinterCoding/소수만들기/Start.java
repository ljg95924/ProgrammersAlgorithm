package summerWinterCoding.소수만들기;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] nums = {{1, 2, 3, 4}, {1, 2, 7, 6, 4}};
        for (int[] num: nums
             ) {
            System.out.println(solution.solution(num));

        }
    }
}
