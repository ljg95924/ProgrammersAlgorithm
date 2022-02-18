package kakaoBlindRecruitment.신고결과받기;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        String[] report2 = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        int[] a = solution.solution(id_list, report, 2);
        for (int b:a
             ) {
            System.out.println(b);
        }

    }

}
