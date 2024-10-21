# SportsTimeTracker

The `SportsTimeTracker` is a simple Java application that allows users to log sports activities, view logged activities, and calculate the total time spent on sports for the week.

## Class Structure

The class has one private variable `activities` which is a `Map` where the keys are the names of the activities (as `String`) and the values are the durations of the activities (as `Integer`).

## Methods

- **Constructor:** The `SportsTimeTracker()` constructor initializes the `activities` map as a new `HashMap`.

- **logActivity(String activity, int duration):** This method takes an activity name and its duration as parameters. It adds the duration to the current duration of the activity in the `activities` map. If the activity does not exist in the map, it gets the default value of 0 and adds the duration to it.

- **viewActivities():** This method iterates over the `activities` map and prints each activity and its total duration.

- **calculateTotalTime():** This method calculates the total time spent on all activities. It iterates over the values of the `activities` map (which are the durations of the activities) and adds them up. It then returns the total duration.

## Usage

The `main` method is the entry point of the application. It creates a `SportsTimeTracker` object, logs some activities, views the logged activities, and prints the total time spent on sports.

Here's an example of how to use it:

```java
SportsTimeTracker tracker = new SportsTimeTracker();
tracker.logActivity("Running", 30);
tracker.logActivity("Swimming", 60);
tracker.viewActivities();
System.out.println("Total time spent on sports: " + tracker.calculateTotalTime() + " minutes");
```
