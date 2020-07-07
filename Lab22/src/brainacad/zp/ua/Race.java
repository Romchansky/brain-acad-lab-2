package brainacad.zp.ua;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

public class Race {
    public static AtomicLong startRaceTime = new AtomicLong();

    public static void main(String[] args) {
        int count = 7;

        ArrayList<RaceCarRunnable> cars = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(count);
        cars.add(new RaceCarRunnable("Ford Mustang Shelby GT500", 300, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Chevrolet Camaro  ZL1", 321, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Nissan GT-R", 315, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Nissan 370Z", 270, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Toyota Supra", 280, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Mazda RX7", 251, 402, countDownLatch));
        cars.add(new RaceCarRunnable("Honda S2000", 241, 402, countDownLatch));

        List<Thread> threads = cars.stream().map(Thread::new).collect(Collectors.toList());
        startRace(threads);
        try {
            sleep(1000);
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void startRace(List<Thread> cars) {
        new Thread(() -> {
            try {
                for (int i = 3; i >= 1; i--) {
                    System.out.println(i + "...");
                    sleep(500);
                }
                System.out.println("GO!!!");
                for (Thread thread : cars) {
                    thread.start();
                    startRaceTime.lazySet(currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}

