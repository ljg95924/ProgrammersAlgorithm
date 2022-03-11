package 연습문제.더맵게;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int k) {
        int count = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int sco : scoville
        ) {
            heap.add(sco);
        }


        while (heap.size() > 1) {
            if (heap.peek() < k) {
                heap.add(heap.poll() + (heap.poll() * 2));
                count++;
            } else break;
        }
        if (heap.poll() < k) return -1;

        return count;
    }
}
