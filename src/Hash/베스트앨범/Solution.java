package Hash.베스트앨범;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int count;
        Map<String, Integer> genreTotalPlayMap = new HashMap<>();
        List<MusicInfo> musicInfoList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            genreTotalPlayMap.put(genres[i], genreTotalPlayMap.getOrDefault(genres[i], 0) + plays[i]);
            musicInfoList.add(new MusicInfo(genres[i], plays[i], i));
        }

        // play 높은 순으로부터 정렬
        musicInfoList = musicInfoList.stream()
                .sorted(Comparator.comparing(MusicInfo::getPlay).reversed())
                .collect(Collectors.toList());

        // value 값으로 정렬
        List<String> genreKey = new ArrayList<>(genreTotalPlayMap.keySet());
        Collections.sort(genreKey, (o1, o2) -> (genreTotalPlayMap.get(o2).compareTo(genreTotalPlayMap.get(o1))));
        for (String key : genreKey) {
            count = 0;
            Iterator<MusicInfo> iterator = musicInfoList.iterator();
            while (iterator.hasNext()) {
                MusicInfo musicInfo = iterator.next();
                if (musicInfo.getGenre().equals(key) && count < 2) {
                    indexList.add(musicInfo.getIndex());
                    count++;
                }
            }
        }

        return indexList.stream().mapToInt(Integer::intValue).toArray();
    }


    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key)))
                return key;
        }
        return null;
    }

    public class MusicInfo {
        private String genre;
        private int play;
        private int index;

        MusicInfo(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }

        public String getGenre() {
            return genre;
        }

        public int getPlay() {
            return play;
        }

        public int getIndex() {
            return index;
        }
    }
}

