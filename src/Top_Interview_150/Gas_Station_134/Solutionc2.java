package Top_Interview_150.Gas_Station_134;

public class Solutionc2 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0;
        int surplus = 0;
        int S = 0;

        for(int i = 0; i < n; ++i){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                S = i+1;
            }
        }
        return (total_surplus < 0) ? -1 : S;
    }
}
