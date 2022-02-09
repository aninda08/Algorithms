package com.aninda.greedy;

import java.util.Arrays;

public class ActivitySelection {
    private int[] startActivities;
    private int[] endActivities;

    public ActivitySelection(int[] startActivities, int[] endActivities) {
        this.startActivities = startActivities;
        this.endActivities = endActivities;
    }
    
    public void printMaxActivities() {
        System.out.print("Following Activities are selected:: ");

        int i = 0;
        System.out.print(i + " ");

        for (int j = 1; j < this.endActivities.length; j++) {
            if (this.endActivities[i] <= this.startActivities[j]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
    
    public void printActivities() {
        System.out.println("Starting Activies:: " + Arrays.toString(this.startActivities));
        System.out.println("Ending Activies::   " + Arrays.toString(this.endActivities));
    }
}
