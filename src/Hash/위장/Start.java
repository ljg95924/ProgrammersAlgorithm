package Hash.위장;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] data1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] data2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution.solution(data1));
        System.out.println(solution.solution(data2));
    }
}
