package stack.주식가격;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        // queue 에 prices 데이터 입력
        for (int price : prices
        ) {
            queue.add(price);
        }

        for (int i = 0; i < prices.length; i++) { // prices 길이만큼 반복
            int count = 0; // 떨어지지 않은 초 계산
            int onePrice = queue.remove(); // 기준이 될 가격

            for (int price : queue  //queue에 기준이 될가격을 제외하고 반복
            ) {
                if (onePrice <= price) {    // 기준이 될가격보다 크거나 같을떄 초++;
                    count++;
                } else {
                    if(count>=1) count++;
                    if (queue.peek() == price) count++;
                    //if(prices.length-count-2 == i) count++;//7-1 == 4
                    break;
                }
            }
            answer[i] = count;  // 몇초인지 결과값 answer에 넣어쥼
        }
        return answer;
    }
}
