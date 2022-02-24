package stack.다리를지나는트럭;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int bridge_length[] = {2, 100, 100};
        int weight[] = {10, 100, 100};
        int truck_weights[][] = {{7, 4, 5, 6}, {10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}};

        //System.out.println(solution.solution(bridge_length[0], weight[0], truck_weights[0]));
        //System.out.println(solution.solution(bridge_length[1], weight[1], truck_weights[1]));
        //System.out.println(solution.solution(bridge_length[2], weight[2], truck_weights[2]));
        System.out.println(solution.solution(7,23, new int[]{1, 6, 4, 2, 5, 7, 8, 1, 2}));
    }
}
