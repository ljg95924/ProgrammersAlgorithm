package kakaoBlindRecruitment.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userInfoMap = new HashMap<>();
        List<String> resultList = new ArrayList<>();

        for (String str : record
        ) {
            String temp[] = str.split(" ");
            if(temp[0].equals("Enter")){
                if(!userInfoMap.containsKey(temp[1])){ // 들어온 사람이 처음 들어온 사람일 경우
                    userInfoMap.put(temp[1],temp[2]);
                }else {
                    if(!userInfoMap.get(temp[1]).equals(temp[2])){ // 들어온 사람이 닉네임을 변경하고 들어왔을 경우
                        userInfoMap.put(temp[1],temp[2]);
                    }
                }
            }else if(temp[0].equals("Change")){
                userInfoMap.put(temp[1],temp[2]);
            }
        }

        for (String str: record
             ) {
            String temp[] = str.split(" ");
            if(temp[0].equals("Enter")) {
                resultList.add(userInfoMap.get(temp[1])+"님이 들어왔습니다.");
            }else if(temp[0].equals("Leave")){
                resultList.add(userInfoMap.get(temp[1])+"님이 나갔습니다.");
            }
        }

        return resultList.toArray(new String[0]);
    }
}
