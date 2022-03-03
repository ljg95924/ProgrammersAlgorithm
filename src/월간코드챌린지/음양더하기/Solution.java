package 월간코드챌린지.음양더하기;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] numbers = new int[absolutes.length];
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) numbers[i] = -absolutes[i];
            else numbers[i] = absolutes[i];
        }
        for (int number : numbers
        ) {
            answer += number;
        }
        return answer;
    }
}
