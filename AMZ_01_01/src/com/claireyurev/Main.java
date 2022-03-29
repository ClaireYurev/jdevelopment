package com.claireyurev;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // int[] processingPower = new int[]{1, 2, 3, 4};
        List<Integer> processingPower = new ArrayList<>();
        processingPower.add(1);
        processingPower.add(2);
        processingPower.add(36666);
        processingPower.add(4);

        // int[] bootingPower = new int[]{1, 2, 3, 4};
        List<Integer> bootingPower = new ArrayList<>();
        bootingPower.add(1);
        bootingPower.add(2);
        bootingPower.add(3);
        bootingPower.add(4);

        long powerMax = 10;

        //Solution test = new Solution();
        Main test = new Main();
        System.out.println(test.findMaximumSustainableClusterSize(processingPower, bootingPower, powerMax));   // output should be 2
    }

    public int findMaximumSustainableClusterSize(List<Integer> processingPower, List<Integer> bootingPower, long powerMax){
        if(processingPower == null || bootingPower == null
                || processingPower.size() == 0 || processingPower.size() != bootingPower.size()){
            return 0;
        }

        PriorityQueue<Integer> maximumBootingPower = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int maxSustainableClusterSize = 0;
        int specificSize = 1;

        int first = 0;
        int last = 0;

        int sumOfProcessingPower = processingPower.get(0);
        maximumBootingPower.add(bootingPower.get(0));
        while(last < processingPower.size()){
            int specificBootingPower = maximumBootingPower.peek();
            int netPowerConsumption = specificBootingPower + sumOfProcessingPower * specificSize;

            if(netPowerConsumption <= powerMax){
                maxSustainableClusterSize = specificSize;
                last++;
                specificSize++;
            }
            else{
                sumOfProcessingPower -= processingPower.get(first);
                maximumBootingPower.remove(bootingPower.get(first));
                first++;
                last++;
            }

            if(last < processingPower.size()){
                maximumBootingPower.add(bootingPower.get(last));
                sumOfProcessingPower += processingPower.get(last);
            }
        }

        return maxSustainableClusterSize;
    }

}
