package create;

public class Thread0 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            // code that will run in a new thread
            System.out.println("Now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        thread.setName("New Worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("In thread: " + Thread.currentThread().getName()
                + " before starting a new thread");
        thread.start();
        System.out.println("In thread: " + Thread.currentThread().getName()
                + " after starting a new thread");
        // OS에 의해서 비동기적으로 발생되기 때문에 스레드를 시작하더라도 시간이 걸림

        Thread.sleep(10000);
    }

}