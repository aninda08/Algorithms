package com.aninda.demo.greedy;

import java.util.ArrayList;
import java.util.Arrays;

import com.aninda.greedy.JobSequencing;

public class JobSequencingDemoHandler {
    public static void jobSequencingDemo() {
        
        try {
            int timeslot = 3;
            ArrayList<JobSequencing> jobs = new ArrayList<>();

            jobs.add(new JobSequencing('a', 2, 100));
            jobs.add(new JobSequencing('b', 1, 19));
            jobs.add(new JobSequencing('c', 2, 27));
            jobs.add(new JobSequencing('d', 1, 25));
            jobs.add(new JobSequencing('e', 3, 15));

            // System.out.println("Jobs for Scheduling::" + jobs.toString());

            JobSequencing job = new JobSequencing();

            job.printJobScheduling(jobs, timeslot);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
