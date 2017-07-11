/**
 * Created by malhotrs on 7/5/2017.
 */

class NotificationBar
{
    static NotificationBar ref;
    private NotificationBar()
    {
        System.out.println("NotificationBar() invoked");
    }

    static NotificationBar getInstance()
    {
        if(ref == null) {
            ref = new NotificationBar();
        }
        else {
            System.out.println("Returning existing instance");
        }
        return ref;
    }
}

public class Singleton
{
    public static void main(String[] args) {
        NotificationBar nb = NotificationBar.getInstance();
        NotificationBar nb1 = NotificationBar.getInstance();
}
}
