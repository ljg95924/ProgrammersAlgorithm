package kakaoBlindRecruitment.추석트래픽;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        int count;
        Map<LocalTime, LocalTime> timeMap = new LinkedHashMap<>(); // <도착시간, 시작시간>
        for (String line : lines
        ) {
            String info[] = line.split(" |s");
            //String date[] = info[0].split("-");
            String time[] = info[1].split(":|\\.");
            if (info[2].length() == 4) {
                info[2] += "0";
            }
            if (info[2].length() == 3) {
                info[2] = info[2] + "00";
            }

            LocalTime keyLocalTime = LocalTime.of(
                    Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]), Integer.parseInt(time[3]) * 1000000);

            LocalTime valueLocalTime = keyLocalTime.minusSeconds(Long.parseLong(info[2].substring(0, 1)));
            if (info[2].length()!=1) {
                valueLocalTime = valueLocalTime.minusNanos(Long.parseLong(info[2].substring(2)) * 1000000);
            }

            timeMap.put(keyLocalTime, valueLocalTime);
            //System.out.println(keyLocalTime + " " + valueLocalTime);

        }

        Iterator<LocalTime> iterator = timeMap.keySet().iterator();
        while (iterator.hasNext()) {
            count = 1;
            LocalTime localTime = iterator.next(); //.minusNanos(timeMap.get(localTime));;

            Iterator<LocalTime> compareIterator = timeMap.keySet().iterator();
            while (compareIterator.hasNext()) {
                LocalTime compareLocalTime = compareIterator.next();

                //기준시간이 localTime 이고 localTime+1초간이 카운트 구간.
                // 그러면 3개의 경우가있다.
                // 1. 기준시간보다 비교끝시간이 뒤에있으면서 비교시작시간이 기준시간보다 앞에있을때
                // 2. 기준시간보다 비교시작시간이 앞에있으면서 기준시간+1보다 비교끝시간이 뒤에있을때
                // 3. 기준시간+1보다 비교시작시간이 앞에있으면서 기준시간+1보다 비교끝시간이 뒤에있을떄
                if (
                        localTime.isBefore(compareLocalTime) && timeMap.get(compareLocalTime).isBefore(localTime) ||
                                localTime.isAfter(timeMap.get(compareLocalTime)) && localTime.plusSeconds(1).isBefore(compareLocalTime) ||
                                localTime.plusSeconds(1).isAfter(timeMap.get(compareLocalTime)) && localTime.plusSeconds(1).isBefore(compareLocalTime)) {
                    System.out.println(compareLocalTime);
                    count++;
                }

            }
            //System.out.println("Count: " + count);
            if (count > answer) answer = count;
        }
        return answer;
    }
}
