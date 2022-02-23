package stack.프린터;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList();
        int index = 0;
        int[] pickOne = new int[2];
        int answer = 0;
        for (int priority : priorities
        ) {
            queue.add(new int[]{priority, index});
            index++;
        }

        do {
            boolean flag = true;
            while (flag) {
                pickOne = queue.remove(); // 인쇄할 맨 앞 문서 빼오기
                Iterator<int[]> iterator = queue.iterator();
                flag = false;
                while (iterator.hasNext()) {
                    int temp = iterator.next()[0];
                    if (temp > pickOne[0]) { // 인쇄할 문서보다 중요한 문서가 있을 경우
                        flag = true;
                        break;
                    }
                }
                if (flag == true) queue.add(pickOne); // 중요한 문서가 있으면 인쇄하려던 문서는 맨뒤로
            }
            answer++; // 인쇄될때마다 카운트
        } while (pickOne[1] != location); // 원하는 location 번호가 나올때까지

        return answer;
    }
}
