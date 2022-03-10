package 연습문제.oneTwoFour나라의숫자;

public class Solution {
    int count;
    StringBuilder builder = new StringBuilder();

    public String solution(int n) {

        // 123 / 3 -> 0 (124)
        // 456 / 3 -> 1 (11,12,14)
        // 789 / 3 -> 2 (21,22,24)
        // 101112 / 3 -> 3 (41 42 44)
        // 131415 / 3 -> 4 (111,112,114)
        // 161718 / 3 -> 5 (121,122,124)
        // 192021 / 3 -> 6 (141,142,144)
        // 222324 -> 211, 212, 214
        // 3개 ->1자리 / 9개 ->2자리 / 27 ->3자리 / 81 / 243 / 729 / 2187 /
        //int count = 0;
        StringBuilder builder = new StringBuilder();
        //this.count = count;
        this.builder = builder;
        int powSum = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (powSum + Math.pow(3, i) <= n) {
                powSum += Math.pow(3, i);
                builder.append(1);
                index++;
            }
        }


        this.count = n - powSum;
/*        System.out.println("n" + n);
        System.out.println("powSum" + powSum);
        System.out.println("count" + count);
        System.out.println("index" + index);*/
        processing(index);
        System.out.println("최종:" + builder.toString());
        return builder.toString();
    }

    private void processing(int index) {

        while (count != 0) {
            count--;

            if (builder.charAt(index - 1) == '1') {
                builder.setCharAt(index - 1, '2');

            } else if (builder.charAt(index - 1) == '2') {
                builder.setCharAt(index - 1, '4');

            } else if (builder.charAt(index - 1) == '4') {
                builder.setCharAt(index - 1, '1');

                for (int i = index - 1; i <= 0; i--) {
                    System.out.println(index - 1);
                    if (builder.charAt(i) == '1') {
                        builder.setCharAt(i, '2');
                        break;
                    } else if (builder.charAt(i) == '2') {
                        builder.setCharAt(i, '4');
                        break;
                    } else if (builder.charAt(i) == '4') {
                        builder.setCharAt(i, '1');
                    }
                }

            }
        }
    }
}
