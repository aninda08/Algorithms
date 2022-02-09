package com.aninda.demo.greedy;

import com.aninda.greedy.ActivitySelection;

public class ActivitySelectionDemoHandler {
    public static void activitySelectionDemo() {
        int start[] =  {1, 3, 0, 5, 8, 5};
        int finish[] =  {2, 4, 6, 7, 9, 9};

        ActivitySelection as = new ActivitySelection(start, finish);

        System.out.println("List of Activities with start and end time");
        as.printActivities();
        
        as.printMaxActivities();
    }
}
