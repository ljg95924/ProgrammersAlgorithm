package kakao코드예선.카카오프렌즈컬러링북;

public class Solution {
    int[][] copyPicture;

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        copyPicture = picture;
        int count = 0;
        int pictureColor = 0;


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (copyPicture[i][j] != 0) {
                    pictureColor = copyPicture[i][j];
                    copyPicture[i][j] = 0;
                    countColor(pictureColor, i, j);
                }
            }

        }

        return answer;
    }

    private int countColor(int pictureColor, int m, int n) {
        int count = 1;
        if (m + 1 == copyPicture.length && n + 1 == copyPicture[m].length) return count;

        if (m + 1 == copyPicture.length) {
            for (int j = n + 1; j < copyPicture[m].length; j++) {
                if (copyPicture[m][j] == pictureColor) {
                    copyPicture[m][j] = 0;
                    count++;
                } else return count;
            }
            return count;
        }

        if (n + 1 == copyPicture[m].length) {
            for (int i = m + 1; i < copyPicture.length; i++) {
                if (copyPicture[i][n] == pictureColor) {
                    copyPicture[i][n] = 0;
                    count++;
                } else return count;
            }
            return count;
        }

        for (int i = m; i < copyPicture.length; i++) {
            for (int j = n + 1; j < copyPicture[m].length; j++) {
                if (copyPicture[i][j] == pictureColor) {
                    count++;
                }else break;
            }
        }
    }
}
