package JavaBasics4;

class TestThread1 implements Runnable {
    private Object obj1;
    private Object obj2;

    public TestThread1(Object obj1, Object obj2) {
        super();
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void run() {
        synchronized (obj1) {
            System.out.println(Thread.currentThread().getName() + " Locking obj1...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName() + " Locking obj2...");
            }
        }
    }
}
