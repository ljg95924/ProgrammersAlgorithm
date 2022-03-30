package 연습문제.탐욕법.체육복;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }
        for (int i = 0; i < reserve.length; i++) {
            map.put(reserve[i], 2);
        }
        for (int i = 0; i < lost.length; i++) {
            map.put(lost[i], map.get(lost[i]) - 1);
        }

        if (n == 1) return map.get(1);
        if (map.get(1) == 0 && map.get(2) == 2) {
            map.put(1, 1);
            map.put(2, 1);
        }
        if (map.get(1) == 0) map.put(1, -1);
        if (map.get(n) == 0 && map.get(n - 1) == 2) {
            map.put(n, 1);
            map.put(n - 1, 1);
        }
        if (map.get(n) == 0) map.put(n, -1);

        for (int i = 0; i < lost.length; i++) {
            if (map.get(lost[i]) == 0) {
                if (map.get(lost[i] - 1) == 2) {
                    map.put(lost[i], 1);
                    map.put(lost[i] - 1, 1);
                } else if (map.get(lost[i] + 1) == 2) {
                    map.put(lost[i], 1);
                    map.put(lost[i] + 1, 1);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (map.get(i) > 0) answer++;
        }
        return answer;
    }

}
