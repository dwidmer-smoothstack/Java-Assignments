package JavaBasics4;

import JavaBasics4.Assignment3;

class ProducerThread implements Runnable {
    Assignment3.ControlCenter controlCenter;
    public ProducerThread(Assignment3.ControlCenter cc) {
        this.controlCenter = cc;
    }
    @Override
    public void run()
    {
        try {
            controlCenter.produce();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}