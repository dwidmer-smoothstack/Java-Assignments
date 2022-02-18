package JavaBasics4;

public class Assignment2 {
    public static void main(String[] args) {
        Object sharedObj1 = new Object();
        Object sharedObj2 = new Object();
        TestThread1 testThread1 = new TestThread1(sharedObj1, sharedObj2);
        TestThread2 testThread2 = new TestThread2(sharedObj1, sharedObj2);
        Thread t1 = new Thread(testThread1, "Thread 1");
        Thread t2 = new Thread(testThread2, "Thread 2");
        t1.start();
        t2.start();
    }
}