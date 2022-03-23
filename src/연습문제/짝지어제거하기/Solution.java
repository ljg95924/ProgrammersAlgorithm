package 연습문제.짝지어제거하기;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.add(s.charAt(i));
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }
}
