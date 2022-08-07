package ss4_class_object.exercise.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    long getStartTime() {
        return this.startTime;
    }

    long getEndTime() {
        return this.endTime;
    }

    // constructor
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    long start() {
        return this.startTime = System.currentTimeMillis();
    }

    long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }


}
