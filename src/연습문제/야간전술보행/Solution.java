package 연습문제.야간전술보행;

class Solution {
    public int solution(int distance, int[][] scope, int[][] times) {
        int answer = 0;

        for (int i = 1; i <= distance; i++) {
            answer++;
    // 근무 휴식
            for (int j = 0; j < times.length; j++) {
                if(scope[j][0] > scope[j][1]){
                    int temp = scope[j][1];
                    scope[j][1] = scope[j][0];
                    scope[j][0] = temp;
                }
                if(scope[j][0] <= i && scope[j][1] >= i) {
                    int nowTime = i % (times[j][0] + times[j][1]);

                    if(nowTime != 0 && nowTime <= times[j][0]){
                        return answer;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}