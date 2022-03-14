package sort.가장큰수;

import java.util.*;

public class Solution {
    public String solution(int[] numbers) {
        Map<Integer, String> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                String str = String.valueOf(numbers[i] % 10);
                map.put(i, (numbers[i]) + str + str + str);
            } else if (numbers[i] < 100) {
                String str = String.valueOf(numbers[i] % 100);
                map.put(i, numbers[i] + str + str);
            } else if (numbers[i] < 1000) {
                String str = String.valueOf(numbers[i] % 1000);
                map.put(i, numbers[i] + str);
            } else {
                map.put(i, String.valueOf(numbers[i]));
            }
        }

        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        if (numbers[entryList.get(0).getKey()] == 0) return "0";

        for (Map.Entry<Integer, String> entry : entryList) {
            stringBuilder.append(numbers[entry.getKey()]);
        }
        return stringBuilder.toString();

    }
}
