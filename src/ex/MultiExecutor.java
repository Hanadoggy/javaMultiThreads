package ex;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here
    private List<Thread> jobs = new ArrayList<>();

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
//        for (Runnable task : tasks) {
//            jobs.add(new Thread(task));
//        }
        tasks.forEach(t -> jobs.add(new Thread(t)));
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
//        for (Thread task : jobs) {
//            task.start();
//        }
        jobs.forEach(Thread::start);
    }
}