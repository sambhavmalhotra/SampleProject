/**
 * Created by malhotrs on 7/10/2017.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

class StIn {
    static int i = 20;
    StIn() {i = 0;}
    public int print() {return i;}
}

class StudentInfoEx implements Serializable
{
    //transient data members will not take part in Serialization
    String name;
    transient int rid;
    String address;
    StudentInfoEx(String n, int r, String address)
    {
        this.name = n;
        this.rid = r;
        this.address = address;
    }

    void printStudentInfo()
    {
        StIn s = new StIn();
        System.out.println("StudentInfo details Test:"+name+" "+rid+" " + " " + address + "\n" + s.print());
    }

    public String toString()
    {
        StIn s = new StIn();
        return "name = " + name + ", id = " + rid + ", address= " + address +", count = " + s.print();
    }
}


class StudentInfoArray implements Serializable{
    StudentInfoEx arr[];

    StudentInfoArray(StudentInfoEx arr[])
    {
        this.arr = arr;
    }
}

class StudentInfoList implements Serializable{
    List  lst;

    StudentInfoList(List lst)
    {
        this.lst = lst;
    }
}