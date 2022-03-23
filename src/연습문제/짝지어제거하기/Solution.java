package 연습문제.짝지어제거하기;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    flag = true;
                }
            }
        }
        if (sb.isEmpty()) return 1;

        return 0;
    }
}
