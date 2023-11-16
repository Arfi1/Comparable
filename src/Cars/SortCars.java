package Cars;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {
    ArrayList<Car> cars;
    public static void main(String[] args) {
        new SortCars().run();
    }

    private void run() {
        cars = new ArrayList<>();
        cars.add(new Car("XF 21 031"));
        cars.add(new Car("FB 20 049"));
        cars.add(new Car("GB 20 556"));


        for (int i = 0; i <cars.size(); i ++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        System.out.println("------After sorting------");

        for (int i = 0; i < cars.size(); i ++) {
            System.out.println(cars.get(i));
        }

    }
}
