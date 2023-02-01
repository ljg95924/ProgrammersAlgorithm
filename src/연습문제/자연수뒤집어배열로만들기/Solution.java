package 연습문제.자연수뒤집어배열로만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public Integer[] solution(long n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add ((int) (n % 10));
            n /= 10;

        }

        return list.stream().toArray(Integer[]::new);
    }
}