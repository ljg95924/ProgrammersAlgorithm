package kakao개발자겨울인턴십.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basketStack = new Stack<>();
        
        for (int move :moves
             ) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][move-1]!=0){
                    if(basketStack.isEmpty()){
                        basketStack.add(board[i][move-1]);
                        board[i][move-1] = 0;
                    }else{
                        if(basketStack.peek()==board[i][move-1]){
                            basketStack.pop();
                            board[i][move-1] = 0;
                            answer+=2;
                        }else {
                            basketStack.add(board[i][move-1]);
                            board[i][move-1] = 0;
                        }
                    }
                    break;
                }

            }
        }

        return answer;
    }

}
