package 연습문제.N개의최소공배수;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>(); // 숫자와 그 숫자의 개수

        int count;
        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) map.put(i, 0);

        }
        for (int i = 0; i < arr.length; i++) {
            Iterator<Integer> keys = map.keySet().iterator();
            while (keys.hasNext()) {
                int key = keys.next();
                if (arr[i] < key) break;
                if (arr[i] % key == 0) {
                    count = 0;
                    while (true) {
                        if (arr[i] % key == 0) {
                            arr[i] = arr[i] / key;
                            count++;
                        } else break;

                    }
                    if (map.get(key) < count) {
                        map.put(key, count);
                    }

                }
            }
        }
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int key = keys.next();
            if (map.get(key) != 0) {
                for (int i = 0; i < map.get(key); i++) {
                    answer *= key;
                }
            }
        }
        return answer;
    }
}
