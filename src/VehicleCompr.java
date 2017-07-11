import sun.util.calendar.BaseCalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by malhotrs on 7/10/2017.
 */

class VehicleDealer implements Comparator<VehicleDealer>{
    String companyName;
    String proprietorName;
    double turnover;
    String city;
    Date date;
    public static int param = 0;

    VehicleDealer(String companyName, String proprietorName, double turnover, String city, Date date) {
        this.companyName = companyName;
        this.proprietorName = proprietorName;
        this.turnover = turnover;
        this.city = city;
        this.date = date;
    }

    public String toString() {
        return "\nVehicle Details :\n\n\tCompany Name : " + companyName + "\n\tProprietor Name : " + proprietorName + "\n\tTurnover : " + turnover + "\n\tCity : " + city + "\n\tDate : " + date;
    }

    public int compare(VehicleDealer v1, VehicleDealer v2) {
        int val = 0;
        if(param == 1) {
            VehicleCompareTurnover x = new VehicleCompareTurnover();
            val = x.compare(v1, v2);
        }
        else if(param ==2) {
            VehicleCompareCity x = new VehicleCompareCity();
            val = x.compare(v1, v2);
        }
        else if(param == 3) {
            VehicleCompareDate x = new VehicleCompareDate();
            val = x.compare(v1, v2);
        }
        return val;
    }

    class VehicleCompareTurnover implements Comparator<VehicleDealer> {
        public int compare(VehicleDealer v1, VehicleDealer v2) {
            return (int)(v1.turnover - v2.turnover);
        }
    }

    class VehicleCompareCity implements Comparator<VehicleDealer>{
        public int compare(VehicleDealer v1, VehicleDealer v2) {
            return v1.city.compareTo(v2.city);
        }
    }

    class VehicleCompareDate implements Comparator<VehicleDealer>{
        public int compare(VehicleDealer v1, VehicleDealer v2) {
            return v1.date.compareTo(v2.date);
        }
    }
}

public class VehicleCompr {
    public static void main(String[] args) {

        VehicleDealer vd = new VehicleDealer("Volkswagen", "Nazis", 500000000, "Chicago", new Date(1850, 01, 01));

        System.out.println("Sort on basis of? (1 - Turnover, 2 - City, 3 - Date) : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            vd.param = Integer.parseInt(br.readLine());
        } catch(IOException ioe) {
            System.out.println(ioe);
        }

        TreeSet<VehicleDealer> tvd = new TreeSet<>(vd);
        tvd.add(new VehicleDealer("Tata", "Ratan", 350000000, "Gujarat", new Date(1750, 01, 01)));
        tvd.add(new VehicleDealer("Maruti", "Hero", 300000000, "Chennai", new Date(1925, 01, 01)));
        tvd.add(new VehicleDealer("Figo", "Abcd", 400000000, "Mumbai", new Date(1820, 01, 01)));

        System.out.println(tvd);
    }
}
