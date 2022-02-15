package com.aninda.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencing {
    private char id;
    private int deadline, profit;

    public JobSequencing() {
    }

    public JobSequencing(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    
    class ProfitComparator implements Comparator<JobSequencing> {

        @Override
        public int compare(JobSequencing job1, JobSequencing job2) {
            return job2.profit - job1.profit;
        }
        
    }

    @Override
    public String toString() {
        return "[deadline=" + deadline + ", id=" + id + ", profit=" + profit + "]";
    }

    public void printJobScheduling(ArrayList<JobSequencing> jobs, int t) {
        Collections.sort(jobs, new ProfitComparator());
        
        boolean[] slot = new boolean[t];
        char[] scheduledJobs = new char[t];

        for (JobSequencing job : jobs) {
            for (int i = Math.min(t - 1, job.deadline - 1); i >= 0; i--) {
                if (!slot[i]) {
                    slot[i] = true;
                    scheduledJobs[i] = job.id;
                    break;
                }
            }
        }
        
        for(char scheduleJob:scheduledJobs)
            System.out.println(scheduleJob + " ");
    }
}
