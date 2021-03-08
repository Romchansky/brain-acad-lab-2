package brainacad.zp.ua;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class RaceCarRunnable extends Car {

    private int passed;
    private int distance;
    private boolean isFinish;
    private CountDownLatch countDownLatch;
    private long finishTime;

    public long getFinishTime() {
        return finishTime;
    }

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch countDownLatch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.countDownLatch = countDownLatch;
    }

    static int count = 1;

    public int getRandomSpeed() {
        int min = getMaxSpeed() / 2;
        int max = getMaxSpeed();
        Random r = new Random();
        int speed = r.nextInt((max - min) + 1) + min;
        return speed;
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    void print() {
        System.out.println("Car name: " + getName() + " => " + "/ speed: " + getRandomSpeed() +
                " / progress: " + getPassed() + " / " + getDistance() + "/ time: " + Race.startRaceTime);
    }

    @Override
    public void run() {
        super.run();
        while (!isFinish) {
            try {
                int speed = getRandomSpeed();
                passed += speed;
                print();
                sleep(1000);
                if (passed >= distance)
                    isFinish = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            if (passed >= distance) {
                System.out.println("car Place: " + count++ + " -> " + getName());
            }
        }
    }
}
