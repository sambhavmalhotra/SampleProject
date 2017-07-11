/**
 * Created by malhotrs on 7/10/2017.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemoEx
{

    public static void main(String[] args)
    {
        try
        {
//Serialization starts here
            StudentInfoEx si = new StudentInfoEx("testpurpose", 318, "Hyderabad");

            //.ser is a standard file extension, to store serialized object
            FileOutputStream fos = new FileOutputStream("student.txt");
            FileInputStream fis = new FileInputStream("student.txt");
            //instead of writing object stream to a file, it is also possible to send object thru
            //Network using socket programming
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("Serializing the object...");
            oos.writeObject(si);
            System.out.println(ois.readObject());
            oos.close();
            fos.close();
            System.out.println("Done");
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}