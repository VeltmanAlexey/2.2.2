package web.servies;

import web.Model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int howManyCarGet);

}
