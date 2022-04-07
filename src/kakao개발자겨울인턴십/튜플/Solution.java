package kakao개발자겨울인턴십.튜플;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Set<String> stringSet = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        String[] sSplitArray = s.split("},\\{"); // 특수문자 제거
        Arrays.sort(sSplitArray, new Comparator<String>() { // 자리수기준으로 오름차순
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String str : sSplitArray
        ) {
            String[] num = str.split(",");
            for (String n : num
            ) {
                stringSet.add(n); //정답 숫자를 차례대로 stringSet에 저장
            }
        }
        for (String a : stringSet
        ) {
            list.add(Integer.parseInt(a)); // 인트형으로 변환 후 list에 정답 저장
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
