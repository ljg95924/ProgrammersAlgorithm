package sort.H_Index;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int min = 0;
        int max = citations[citations.length - 1];
        int count = 0;
        for (int h = min; h <= max; h++) {
            for (int n = 0; n < citations.length; n++) {
                if (citations[n] >= h) count++;
            }
            if (count >= h && citations.length + 1 - count <= h && answer < h) answer = h;
            count = 0;
        }

        return answer;
    }
}
