package kakaoBlindRecruitment.추석트래픽;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] lines = {
                "2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"};
       // System.out.println(solution.solution(lines));
        String[] lines1 ={"2016-09-15 00:00:00.000 3s"};
        System.out.println(solution.solution(lines1));
    }
}
