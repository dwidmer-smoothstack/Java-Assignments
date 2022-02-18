package JavaBasics4;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        ControlCenter controlCenter = new ControlCenter();

        Thread producerThread = new Thread(new ProducerThread(controlCenter));
        Thread consumerThread = new Thread(new ConsumerThread(controlCenter));

        producerThread.start();
        consumerThread.start();
    }

    public static class ControlCenter {
        int bound = 5;
        BoundedBuffer<Integer> boundedBuffer = new BoundedBuffer<>(bound);

        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this)
                {

                    while (boundedBuffer.isFull())
                        wait();

                    System.out.println("Producer produced-" + value);

                    boundedBuffer.put(value++);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this)
                {

                    while (boundedBuffer.isEmpty())
                        wait();
                    int val = boundedBuffer.take();

                    System.out.println("Consumer consumed-" + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
