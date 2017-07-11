/**
 * Created by malhotrs on 7/5/2017.
 */
class CountPrinter {
    static int printerCnt = 0;
    private CountPrinter() {
        printerCnt++;
        System.out.println("Created Printer " + printerCnt);
    }
    static CountPrinter addPrinter() {
        if(printerCnt < 3)
        {
            return new CountPrinter();
        }
        else
        {
            System.out.println("Null");
            return null;
        }
    }
    static CountPrinter deletePrinter() {
        System.out.println("Deleted Printer " + printerCnt);
        printerCnt--;
        return null;
    }
    public int printerCount() {
        return printerCnt;
    }
}
public class Counter {
    public static void main(String[] args) {
        CountPrinter c1 = CountPrinter.addPrinter();
        CountPrinter c2 = CountPrinter.addPrinter();
        CountPrinter c3 = CountPrinter.addPrinter();
        CountPrinter c4 = CountPrinter.addPrinter();
        CountPrinter c5 = CountPrinter.addPrinter();
        c3.deletePrinter();
        c4.deletePrinter();
        CountPrinter c6 = CountPrinter.addPrinter();
        c4.deletePrinter();
        CountPrinter c7 = CountPrinter.addPrinter();
        System.out.println("Active Printers count : " + c7.printerCount());
    }
}