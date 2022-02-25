package kakaoBlindRecruitment.문자열압축;

public class Solution {
    public int solution(String s) {
        int answer = s.length();
        String workingWord = "";
        String beforeWord = "";
        int count = 1;  // 중복횟수
        StringBuilder builder = new StringBuilder();
        // s 문자를 i개씩 짜르는데 j번을 거쳐서
        for (int i = 1; i <= s.length(); i++) {
            int j;
            beforeWord = "";
            for (j = 0; j < s.length() / i; j++) {
                workingWord = s.substring((j * i), (j * i) + i); // 순차적으로
                if (!beforeWord.equals(workingWord)) {  // 전 워드랑 현워드랑 다를떄 builder에 현워드 추가
                    builder.append(workingWord);
                    beforeWord = workingWord;
                    count = 1;  //중복횟수 초기화
                } else {
                    count++;
                    if (count == 2) { //중복횟수가 두번일때 builder에 기입
                        builder.insert(builder.length() - workingWord.length(), count);
                    } else if (count <= 10) {    // 중복횟수가 두번 이상, 10번 이하 나왔을 때
                        builder.replace(builder.length() - workingWord.length() - 1, builder.length() - workingWord.length(), Integer.toString(count));
                    } else if (count <= 100) { // 중복횟수가 100번 이하일 경우
                        builder.replace(builder.length() - workingWord.length() - 2, builder.length() - workingWord.length(), Integer.toString(count));
                    } else if (count <= 1000) { // 중복횟수가 100번 이하일 경우
                        builder.replace(builder.length() - workingWord.length() - 3, builder.length() - workingWord.length(), Integer.toString(count));
                    }
                }
            }
            if (i != 1 && s.length() % i != 0) {    // 문자를 2단어 보다 크게 분할 할때 s에 남은 나머지값 bulider에 추가
                builder.append(s.substring(((j - 1) * i) + i));
            }
            if (answer > builder.length()) {
                answer = builder.length();
            }
            builder.setLength(0);
        }
        return answer;
    }
}
