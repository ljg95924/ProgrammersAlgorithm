package summerWinterCoding.멀쩡한사각형;


class Solution {
    public long solution(int w, int h) {
        int gcf = 1;
        long largeNum = 0;
        long smallNum = 0;


        if (w > h) {
            largeNum = w;
            smallNum = h;
        } else {
            largeNum = h;
            smallNum = w;
        }

        for (int i = 1; i <= smallNum; i++) {
            if (largeNum % i == 0) {
                gcf = i;
            }
        }
        return w * h - (largeNum + smallNum - gcf);
    }
}