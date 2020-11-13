package garage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Garage {
    Map<Integer, LinkedList<Car>> garage = new HashMap<Integer,LinkedList<Car>>();

    public void park (Car car) {
        if (garage.containsKey(car.hashCode())) {
            LinkedList<Car> listCars = garage.get(car.hashCode());
            listCars.add(car);

        } else {
            LinkedList<Car> listCars = new LinkedList<Car>();
            listCars.add(car);
            garage.put(car.hashCode(), listCars);
        }
    }

    public void leave (Car car) {
        if (garage.containsKey(car.hashCode())) {
            LinkedList<Car> listCars = garage.get(car.hashCode());
            listCars.remove(car);
        }
    }

    public int getCount(String brand, String model) {
        if (garage.containsKey(brand.hashCode() - model.hashCode())) {
            LinkedList<Car> listCars = garage.get(brand.hashCode() - model.hashCode());
            return listCars.size();
        } else {
            return -1;
        }
    }

    public boolean isExist (String registrationNumber) {
        for(LinkedList<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        for(LinkedList<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.equals(car) && car.getRegistrationNumber() == registrationNumber) {
                    return true;
                }
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(String registrationNumber) {
        for(LinkedList<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber() == registrationNumber) {
                    return car;
                }
            }
        }
        return null;
    }
}
