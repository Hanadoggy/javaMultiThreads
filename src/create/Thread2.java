package create;

public class Thread2 {

    public static void main(String[] args) {

        Thread thread = new MyThread();

        thread.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }

}
