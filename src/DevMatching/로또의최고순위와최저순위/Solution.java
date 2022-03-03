package DevMatching.로또의최고순위와최저순위;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int correctCnt=0;
        for (int lotto:lottos
             ) {
            if(lotto == 0){
                zeroCnt++;
                continue;
            }
            for (int win_num: win_nums
                 ) {
                if(lotto == win_num){
                    correctCnt++;
                    break;
                }
            }
        }
        if(correctCnt==6) return new int[]{1, 1};
        if(correctCnt==5) return new int[]{2-zeroCnt,2};
        if(correctCnt==4) return new int[]{3-zeroCnt,3};
        if(correctCnt==3) return new int[]{4-zeroCnt,4};
        if(correctCnt==2) return new int[]{5-zeroCnt,5};
        if(correctCnt==1) return new int[]{6-zeroCnt,6};
        if(zeroCnt==0) return new int[]{6,6};

        return new int[]{7-zeroCnt,6};
    }
}
