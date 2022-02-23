package stack.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList();
        Queue<Integer> speedQueue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>(); // 정답을 받을 리스트
        int working = 0; // 진행상황
        int date = 0; // 진행 날짜
        int completeCount = 0; // 완료된 개수
        // 작업 진도,속도 큐에 넣기
        for (int progress : progresses
        ) {
            progressQueue.offer(progress);
        }
        for (int speed : speeds) {
            speedQueue.add(speed);
        }
        while (!progressQueue.isEmpty()) {
            date++;
            working = progressQueue.peek() + speedQueue.peek() * date;
            while (working >= 100) {
                completeCount++;
                progressQueue.remove();
                speedQueue.remove();
                if(progressQueue.peek() == null) break;
                working = progressQueue.peek() + speedQueue.peek() * date;
            }
            if (completeCount != 0) {
                answerList.add(completeCount);
                completeCount = 0;
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
