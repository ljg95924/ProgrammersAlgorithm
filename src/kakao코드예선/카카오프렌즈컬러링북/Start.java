package kakao코드예선.카카오프렌즈컬러링북;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        solution.solution(6, 4, picture);
    }
}
