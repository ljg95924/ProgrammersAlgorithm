package summerWinterCoding.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int totalNum = 0;
        int count = 0;
        Arrays.sort(d);
        for (int departmentNum : d
        ) {
            totalNum += departmentNum;
            if (budget >= totalNum) count++;
            else break;
        }
        return count;
    }
}
