package 연습문제.완전탐색.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        Map<Integer, Queue<Integer>> queueMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int number;
        int[] count = {0, 0, 0};
        int maxnum = 0;
        queueMap.put(1, NumOnePerson());
        queueMap.put(2, NumTwoPerson());
        queueMap.put(3, NumThreePerson());

        for (int answer : answers) {
            for (int j = 0; j < 3; j++) {
                number = queueMap.get(j + 1).remove();
                if (answer == number) count[j]++;
                queueMap.get(j + 1).add(number);
            }
        }
        for (int cnt : count
        ) {
            maxnum = Math.max(maxnum, cnt);
        }
        for (int i = 0; i < count.length; i++) {
            if (maxnum == count[i]) list.add(i+1);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public Queue<Integer> NumOnePerson() {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }
        return queue;
    }

    public Queue<Integer> NumTwoPerson() {
        Queue<Integer> queue = new LinkedList<>();
        int j = 1;
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 1) queue.add(2);
            else {
                if (j == 2) j++;
                queue.add(j);
                if (j == 5) j = 0;
                j++;
            }
        }
        return queue;
    }

    public Queue<Integer> NumThreePerson() {
        Queue<Integer> queue = new LinkedList<>();
        //31245
        for (int i = 0; i < 10; i++) {

            if (i < 2) queue.add(3);
            else if (i < 4) queue.add(1);
            else if (i < 6) queue.add(2);
            else if (i < 8) queue.add(4);
            else queue.add(5);

        }
        return queue;
    }
}
