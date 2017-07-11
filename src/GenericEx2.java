/**
 * Created by malhotrs on 7/8/2017.
 */

class Vehicle {
    int vno;
    String model;
    Vehicle() {
        vno = 0;
        model = "Null";
    }
    Vehicle(int vno, String model) {
        this.vno = vno;
        this.model = model;
    }
    public void showDetails() {
        System.out.println("Vehicle Details : \n\tVehicle No. : " + vno + "\n\tModel : " + model);
    }
}

class Insurance {
    int ino;
    String type;
    Insurance() {
        ino = 0;
        type = "Null";
    }
    Insurance(int ino, String type) {
        this.ino = ino;
        this.type = type;
    }
    public void showDetails() {
        System.out.println("Insurance Details : \n\tInsurance No. : " + ino + "\n\tType : " + type);
    }
}

class Gen1<T, X> {

    private T t;
    private X x;

    public Gen1(T t, X x) {
        this.x = x;
        this.t = t;
    }

    public void show() {
        if(t instanceof Vehicle)
        {
            Vehicle vv = (Vehicle)t;
            vv.showDetails();
        }
        if(x instanceof Insurance)
        {
            Insurance ii = (Insurance)x;
            ii.showDetails();
        }
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Insurance i1 = new Insurance();
        Gen1<Vehicle, Insurance> g = new Gen1<>(v1, i1);
        g.show();
    }
}
