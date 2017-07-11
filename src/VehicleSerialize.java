import java.io.*;
import java.io.FileOutputStream;


/**
 * Created by malhotrs on 7/10/2017.
 */

class VehicleAddress implements Serializable{
    String street;
    String city;
    int postalCode;

    VehicleAddress(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
}

class VehicleDetails implements Serializable {
    String regNo;
    String model;
    Boolean insurance;
    VehicleAddress addr;

    VehicleDetails(String regNo, String model, Boolean insurance, String street, String city, int postalCode) {
        this.regNo = regNo;
        this.model = model;
        this.insurance = insurance;
        addr = new VehicleAddress(street, city, postalCode);
    }

    public void printVehicleDetails() {
        System.out.println("Vehicle Details :\n\tRegistration No. : " + regNo + "\n\tModel : " + model + "\n\tInsurance : " +insurance);
    }

    public String toString() {
        return "Vehicle Details :\n\tRegistration No. : " + regNo + "\n\tModel : " + model + "\n\tInsurance : " +insurance;
    }
}

class VehicleDetailsArr implements Serializable {
    VehicleDetails arr[];
    VehicleDetailsArr(VehicleDetails arr[]) {
        this.arr = arr;
    }
}

public class VehicleSerialize {
    public static void main(String[] args) {
        VehicleDetails vArr[] =  new VehicleDetails[4];
        vArr[0] = new VehicleDetails("120", "Swift", false, "Madhapur", "Hyderabad", 500080);
        vArr[1] = new VehicleDetails("121", "Polo", true, "HiTech", "Hyderabad", 500081);
        vArr[2] = new VehicleDetails("122", "Creta", true, "Raheja", "Hyderabad", 500082);
        vArr[3] = new VehicleDetails("123", "i20", false, "Kondapur", "Hyderabad", 500083);

        VehicleDetailsArr v = new VehicleDetailsArr(vArr);

        //VehicleDetailsArr v[] = new VehicleDetailsArr(v1, v2, v3, v4);
        try {
            FileOutputStream fos = new FileOutputStream("vehicle.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("Serializing......");
            oos.writeObject(v);

            oos.close();
            fos.close();
            System.out.println("Done.");

        } catch (FileNotFoundException fnfe) {
            System.out.println("Exception :  " + fnfe);
        }
        catch (IOException ioe) {
            System.out.println("Exception : " + ioe);
        }

    }
}
