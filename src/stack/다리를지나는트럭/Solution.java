package stack.다리를지나는트럭;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<Integer> standByQueue = new LinkedList<>();
    Queue<int[]> bridgeQueue = new LinkedList<>(); // int[] = {weight, time}
    int truckWeightOnBridge = 0;

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int totalTime = 1;

        for (int truckWeight : truck_weights
        ) {
            standByQueue.add(truckWeight);
        }

        do {
            truckWeightOnBridge = 0;
            if (checkBridgeIsEmpty()) {
                totalTime++;
                if (bridgeQueue.peek()[1] == bridge_length) {
                    bridgeQueue.remove();
                }
                if (checkStandByIsEmpty()) {
                    if (truckWeightOnBridge + standByQueue.peek() <= weight && bridgeQueue.size() < bridge_length) {
                        bridgeQueue.add(new int[]{standByQueue.remove(), 0});
                    }
                }
            } else if (checkStandByIsEmpty()) {
                bridgeQueue.add(new int[]{standByQueue.remove(), 0});
            }

        } while (!(standByQueue.isEmpty() && bridgeQueue.isEmpty()));

        return totalTime;

    }

    private boolean checkStandByIsEmpty() {
        if (standByQueue.isEmpty()) return false;
        return true;
    }

    private boolean checkBridgeIsEmpty() {
        if (bridgeQueue.isEmpty()) return false;
        for (int[] bridge : bridgeQueue
        ) {
            truckWeightOnBridge += bridge[0];
            bridge[1]++;
        }
        System.out.print(truckWeightOnBridge);
        System.out.println(Arrays.toString(bridgeQueue.peek()));
        return true;
    }
}
