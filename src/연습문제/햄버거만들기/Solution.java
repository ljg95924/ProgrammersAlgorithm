package 연습문제.햄버거만들기;


import java.util.Arrays;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        builder.append(Arrays.toString(ingredient).replaceAll("[\\[\\], ]",""));

        while (true){
            int i = builder.indexOf("1231");
            if(i == -1) break;
            answer++;
            builder.delete(i, i+4);
        }
        return answer;
    }
}