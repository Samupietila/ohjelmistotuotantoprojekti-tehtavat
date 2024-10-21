package com.example;
import java.util.*;

public class SportsTimeTracker {
    private Map<String, Integer> activities;

    public SportsTimeTracker() {
        activities = new HashMap<>();
    }

    public void logActivity(String activity, int duration) {
        activities.put(activity, activities.getOrDefault(activity, 0) + duration);
    }

    public void viewActivities() {
        for (Map.Entry<String, Integer> entry : activities.entrySet()) {
            System.out.println("Activity: " + entry.getKey() + ", Duration: " + entry.getValue() + " minutes");
        }
    }

    public int calculateTotalTime() {
        int total = 0;
        for (int duration : activities.values()) {
            total += duration;
        }
        return total;
    }

    public static void main(String[] args) {
        SportsTimeTracker tracker = new SportsTimeTracker();
        tracker.logActivity("Running", 30);
        tracker.logActivity("Swimming", 60);
        tracker.viewActivities();
        System.out.println("Total time spent on sports: " + tracker.calculateTotalTime() + " minutes");
    }
}