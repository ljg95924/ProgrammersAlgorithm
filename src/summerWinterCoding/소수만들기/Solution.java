package summerWinterCoding.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if (i >= j || i >= k || j >= k) continue;
                    count += checkNum(nums[i] + nums[j] + nums[k]);

                }
            }
        }

        return count;
    }

    private int checkNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
