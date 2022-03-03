package 월간코드챌린지.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for (int number:numbers
             ) {
            sum+=number;
        }

        return 45-sum;
    }
}
