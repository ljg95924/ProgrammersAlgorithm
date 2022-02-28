package kakao채용연계형인턴십.숫자문자열과영단어;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String data[] = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
        for (String str: data
             ) {
            System.out.println(solution.solution(str));
        }

    }
}
