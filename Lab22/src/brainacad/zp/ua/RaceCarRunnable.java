package brainacad.zp.ua;

import java.util.Random;

import static java.lang.Thread.sleep;

public class RaceCarRunnable extends Car {

    private int passed;
    private int distance;
    private boolean isFinish;

    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance = distance;
    }

    public int getRandomSpeed() {
        int min = getMaxSpeed()/2;
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

    void print(){
        System.out.println("Car name: " + getName() + "=>" + "speed: " + getRandomSpeed() +
                "progress: " + getPassed() + " / " + getDistance());
    }

    @Override
    public void run() {
        super.run();
        while (!isFinish){
            try {
                sleep(1000);
                if(passed >= distance)
                    isFinish = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
