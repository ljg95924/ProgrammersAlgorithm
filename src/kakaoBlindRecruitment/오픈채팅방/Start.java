package kakaoBlindRecruitment.오픈채팅방;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] data = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        System.out.println(solution.solution(data));
    }
}
