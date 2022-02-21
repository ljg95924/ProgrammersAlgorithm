package Hash.전화번호목록;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int count = 0;

        TreeSet<String> treeSet = new TreeSet<>(List.of(phone_book));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String temp_str = (String) iterator.next();
            if (count == 0) { //첫번째 번호일 경우
                count += 1;
                continue;
            }
            if (temp_str.startsWith(treeSet.lower(temp_str))) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
