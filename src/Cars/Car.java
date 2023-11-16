package Cars;

public class Car implements Comparable<Car>{
    private String plate;

    public Car (String plate){
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.plate.compareTo(o.plate);
    }


}
