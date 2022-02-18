package JavaBasics4;
import JavaBasics4.Assignment3;

class ConsumerThread implements Runnable {
    Assignment3.ControlCenter controlCenter;
    public ConsumerThread(Assignment3.ControlCenter cc) {
        this.controlCenter = cc;
    }
    @Override
    public void run()
    {
        try {
            controlCenter.consume();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}