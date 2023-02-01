package 연습문제.뒤에있는큰수찾기;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int targetNum;
        for (int i = 0; i < numbers.length; i++) {
            targetNum = numbers[i];
            answer[i] = -1;
            for (int j = i + 1; j < numbers.length; j++) {
                if(targetNum < numbers[j]){
                    answer[i] = numbers[j];
                    break;
                }
            }
        }
        return answer;
    }
}