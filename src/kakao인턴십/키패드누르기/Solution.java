package kakao인턴십.키패드누르기;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(int[] numbers, String hand) {
        Map<String, Integer> touchMap = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        touchMap.put("L", 10);
        touchMap.put("R", 12);

        for (int number : numbers
        ) {
            if (number == 1 || number == 4 || number == 7) {
                touchMap.put("L", number);
                answer.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                touchMap.put("R", number);
                answer.append("R");
            } else {
                // row = (number - 1) / 3
                // col = (number + 2) % 3
                // 1-> (0,0) 2->(0,1) 3->(0,2)
                // 4-> (1,0) 5->(1,1) 6->(1,2)
                // 7-> (2,0) 8->(2,1) 9->(2,2)
                // *-> (3,0) 0->(3,1) #->(3,2)
                if (number == 0) number = 11;

                int rightRow = (touchMap.get("R") - 1) / 3; //3-1/3 =0
                int rightCol = (touchMap.get("R") + 2) % 3; //3+2%3 = 2

                int leftRow = (touchMap.get("L") - 1) / 3; // 1
                int leftCol = (touchMap.get("L") + 2) % 3; // 0

                int numberRow = (number - 1) / 3; //1
                int numberCol = (number + 2) % 3; //1


                int leftPosition = Math.abs(numberRow - leftRow) + (numberCol - leftCol);
                int rightPosition = Math.abs(rightRow - numberRow) + (rightCol - numberCol);

                if (leftPosition == rightPosition) {
                    if (hand.equals("right")) {
                        touchMap.put("R", number);
                        answer.append("R");
                    } else {
                        touchMap.put("L", number);
                        answer.append("L");
                    }
                } else if (leftPosition < rightPosition) {
                    touchMap.put("L", number);
                    answer.append("L");
                } else {
                    touchMap.put("R", number);
                    answer.append("R");
                }
            }
        }

        return String.valueOf(answer);

    }

}
