package kakaoBlindRecruitment.신고결과받기;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        String[] temp;
        String 신고받은자, 신고한자;
        Map<String, List> map = new HashMap<>(); //String = 신고받은자, List = 신고한자의 리스트
        int[] answer = new int[id_list.length];
        for (String str : report
        ) {
            temp = str.split(" ");
            신고한자 = temp[0];
            신고받은자 = temp[1];
            if (map.containsKey(신고받은자)) {   // map에 이미 신고받은사람이 있을 경우
                if (map.get(신고받은자).indexOf(신고한자) == -1) // 중복신고 방지
                    map.get(신고받은자).add(신고한자);
            } else { // 첫 신고받은자일 경우
                List list = new ArrayList();
                list.add(신고한자);
                map.put(신고받은자, list);
            }
        }
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (map.get(key).size() >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (map.get(key).contains(id_list[i])) {
                        answer[i] += 1;
                    }
                }
            }
        }
        return answer;
    }
}
