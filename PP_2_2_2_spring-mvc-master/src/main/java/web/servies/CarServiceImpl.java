package web.servies;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(100,3_000_000,10));
        carList.add(new Car(300,500_000,2));
        carList.add(new Car(410,900_000,1));
        carList.add(new Car(70,400_000,2));
        carList.add(new Car(240,700_000,5));
    }


    @Override
    public List<Car> getCars(int howManyCarGet) {
        if (howManyCarGet >= 5) {
            return carList;
        } else {
            return carList.subList(0, howManyCarGet);
        }
    }

}
