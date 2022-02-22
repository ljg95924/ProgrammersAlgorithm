package Hash.베스트앨범;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution.solution(genres, plays));
    }
}
