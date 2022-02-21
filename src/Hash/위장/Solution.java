package Hash.위장;

import java.util.*;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if (!hashMap.containsKey(clothes[i][1])) {
                List<String> list = new ArrayList<>();
                list.add(clothes[i][0]);
                hashMap.put(clothes[i][1], list);
            } else {
                hashMap.get(clothes[i][1]).add(clothes[i][0]);
            }
        }
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            List value = hashMap.get(key);
            if (hashMap.size() > 1) {
                answer *= hashMap.get(key).size() + 1; // 옷을 하나씩 안입는 경우의 수 포함
            } else {
                return hashMap.get(key).size(); // 옷의 종류가 한가지일 경우
            }
        }
        return answer - 1; // 아무것도 안입는 경우 제외
    }
}
