package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private static Long CARS_ID = 0L;
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_ID,"Mazda","RX8",3284871L));
        cars.add(new Car(++CARS_ID,"BMW","M3",247523L));
        cars.add(new Car(++CARS_ID,"Audi","Q4",75112454L));
        cars.add(new Car(++CARS_ID,"Lada","Vesta",9254785L));
        cars.add(new Car(++CARS_ID,"UAZ","Patriot",245783L));
    }
    @Override
    public List<Car> index(){
        return cars;
    }

    @Override
    public  List<Car> countCars(int count){
        if(count > cars.size()){ count = cars.size();}
        if(count < 0 ){ count = 0;}
        return cars.stream().limit(count).toList();
    }
}
