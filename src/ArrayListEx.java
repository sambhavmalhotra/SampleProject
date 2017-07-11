/**
 * Created by malhotrs on 7/10/2017.
 */

import java.util.*;

class VehicleArr {
    String model;
    String make;
    double price;
    long units;

    VehicleArr(String model, String make, double price, long units) {
        this.model = model;
        this.make = make;
        this.price = price;
        this.units = units;
    }

    public void showVehicle() {
        System.out.println("Vehicle Details :\n\tModel : " + model + "\n\tMake : " + make + "\n\tPrice : " + price + "\n\tUnits : " + units);
    }
}

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<VehicleArr> alva = new ArrayList<VehicleArr>();

        alva.add(new VehicleArr("Swift", "2012", 450000, 5000));
        alva.add(new VehicleArr("Polo", "2014", 550000, 2000));
        alva.add(new VehicleArr("Creta", "2016", 1050000, 3500));
        alva.add(new VehicleArr("i20", "2015", 850000, 3000));

        ListIterator<VehicleArr> ivr = alva.listIterator();
        System.out.println("-------------------------Actual order----------------------------");
        for(;ivr.hasNext();)
        {
            VehicleArr v = ivr.next();
            v.showVehicle();
        }

        ivr = alva.listIterator();
        System.out.println("-------------------------Shuffled order----------------------------");
        Collections.shuffle(alva);
        for(;ivr.hasNext();)
        {
            VehicleArr v = ivr.next();
            v.showVehicle();
        }

        ivr = alva.listIterator(alva.size()); //alva.Iterator();
        System.out.println("-------------------------Reversed order----------------------------");
        //Collections.reverse(alva);
        for(;ivr.hasPrevious();) //ive.hasNext()
        {
            VehicleArr v = ivr.previous();
            v.showVehicle();
        }
    }
}
