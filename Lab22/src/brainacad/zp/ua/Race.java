package brainacad.zp.ua;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;



public class Race {
    public static void main(String[] args) {

        List<RaceCarRunnable> cars = new ArrayList<>();
        cars.add(new RaceCarRunnable("Ford Mustang Shelby GT500", 300, 402));
        cars.add(new RaceCarRunnable("Chevrolet Camaro  ZL1", 321, 402));
        cars.add(new RaceCarRunnable("Nissan GT-R", 315, 402));
        cars.add(new RaceCarRunnable("Nissan 370Z", 270, 402));
        cars.add(new RaceCarRunnable("Toyota Supra", 280, 402));
        cars.add(new RaceCarRunnable("Mazda RX7", 251, 402));
        cars.add(new RaceCarRunnable("Honda S2000", 241, 402));
        List<Thread> threads = List.of(new Thread(String.valueOf(cars)));

     startRace(threads);
    }

    static void startRace(List<Thread> cars) {
        cars.add(new Thread(() -> {
            try {
                for (int i = 3; i >= 1; i--) {
                    System.out.println(i + "...");
                    sleep(500);
                    continue;
                }
                System.out.println("GO!!!");
                for (Thread thread : cars) {
                    thread.start();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }
}

