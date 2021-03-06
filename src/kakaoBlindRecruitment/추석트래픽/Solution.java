package kakaoBlindRecruitment.추석트래픽;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public class TimeInfo {
        private LocalTime startTime;
        private LocalTime endTime;

        TimeInfo(LocalTime endTime, LocalTime startTime) {
            this.endTime = endTime;
            this.startTime = startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

        public LocalTime getStartTime() {
            return startTime;
        }
    }

    public int solution(String[] lines) {
        int answer = 0;
        int frontCount;
        int backCount;
        List<TimeInfo> timeList = new ArrayList<>();

        if (lines.length == 1) return 1;

        for (String line : lines
        ) {
            String info[] = line.split(" |s");
            String time[] = info[1].split(":|\\.");
            if (info[2].length() == 4) {
                info[2] += "0";
            }
            if (info[2].length() == 3) {
                info[2] = info[2] + "00";
            }

            LocalTime localEndTime = LocalTime.of(
                    Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]), Integer.parseInt(time[3]) * 1000000);

            LocalTime localStartTime = localEndTime.minusSeconds(Long.parseLong(info[2].substring(0, 1)));
            if (info[2].length() != 1) {
                localStartTime = localStartTime.minusNanos(Long.parseLong(info[2].substring(2)) * 1000000);
            }
            timeList.add(new TimeInfo(localEndTime, localStartTime.plusNanos(1000000)));
        }


        Iterator<TimeInfo> standardIterator = timeList.iterator();
        while (standardIterator.hasNext()) {
            frontCount = 1;
            backCount = 1;
            TimeInfo standardTimeInfo = standardIterator.next();

            Iterator<TimeInfo> compareIterator = timeList.iterator();
            while (compareIterator.hasNext()) {
                TimeInfo compareTimeInfo = compareIterator.next();
                if (standardTimeInfo == compareTimeInfo) continue;
                //기준시간이 각 로그가 끝나는 시간(standardTimeInfo.getEndTime())일 경우
                // 다음과 같은 경우의 수가있다.
                // 1. 기준시간보다 비교끝시간이 뒤에있으면서 비교시작시간이 기준시간보다 앞에있을때.
                // 2. 기준시간+1보다 비교시작시간이 앞에있으면서 기준시간+1보다 비교끝시간이 뒤에있을떄.
                // 3. 비교시작시간이 기준시간보다 뒤에있으며 기준시간+1보다 비교끝시간이 앞에 있을경우.
                // 4. 기준시간이 비교시작시간과 같은경우
                // 5. 기준시간+1이 비교끝시간과 같은경우

                if (
                        standardTimeInfo.getEndTime().isBefore(compareTimeInfo.getEndTime()) && compareTimeInfo.getStartTime().isBefore(standardTimeInfo.getEndTime()) ||
                                standardTimeInfo.getEndTime().plusSeconds(1).isAfter(compareTimeInfo.getStartTime()) && standardTimeInfo.getEndTime().plusSeconds(1).isBefore(compareTimeInfo.getEndTime()) ||
                                standardTimeInfo.getEndTime().isBefore(compareTimeInfo.getStartTime()) && standardTimeInfo.getEndTime().plusSeconds(1).isAfter(compareTimeInfo.getEndTime()) ||
                                standardTimeInfo.getEndTime().equals(compareTimeInfo.getStartTime()) ||
                                standardTimeInfo.getEndTime().plusSeconds(1).equals(compareTimeInfo.getEndTime())

                ) {
                    backCount++;
                }
                // 기준시간이 각 로그가 시작하는 시간(standardTimeInfo.getStartTime())일 경우
                if (
                        standardTimeInfo.getStartTime().isBefore(compareTimeInfo.getEndTime()) && compareTimeInfo.getStartTime().isBefore(standardTimeInfo.getStartTime()) ||
                                standardTimeInfo.getStartTime().plusSeconds(1).isAfter(compareTimeInfo.getStartTime()) && standardTimeInfo.getStartTime().plusSeconds(1).isBefore(compareTimeInfo.getEndTime()) ||
                                standardTimeInfo.getStartTime().isBefore(compareTimeInfo.getStartTime()) && standardTimeInfo.getStartTime().plusSeconds(1).isAfter(compareTimeInfo.getEndTime()) ||
                                standardTimeInfo.getStartTime().equals(compareTimeInfo.getStartTime()) ||
                                standardTimeInfo.getStartTime().plusSeconds(1).equals(compareTimeInfo.getEndTime())
                ) {
                    frontCount++;
                }

            }
            if (backCount >= frontCount && backCount > answer) answer = backCount;
            if (backCount < frontCount && frontCount > answer) answer = frontCount;
        }
        return answer;
    }
}
