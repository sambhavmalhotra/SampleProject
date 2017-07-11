

//Access Specifiers:
//Access specifier indicates where all a class member is accessible
//There are four access specifiers in java
//1.private
//private members can be accessed only within the class

//2.public
//public members can be accessed within the class, from other classes,
//other packages also

//3.protected
//protected is related to inheritance

//4.none(or default)
//members with no access specifier, can be accessed within the class, from other classes
//and only within current package

//Access specifiers can be used with data members, member methods, and constructors
class Test5
{
    //Generally data members will be private
    private float val2;
    float val1;

    public Test5(float i, float j)
    {
        val1 = i;
        val2 = j;
        //Note: method(s) can be invoked from constructor
        System.out.println("Test5 constructor");
    }

    private void display(float result)
    {

        System.out.println("Result:"+result);
    }

    public float add()
    {
        //error, access specifier cannot be used with local variables
		/*private */float r = val1+val2;
        System.out.println("in add()");
        display(r);
        return r;
    }

    int modulo()
    {
        float r = val1%val2;

        display(r);

        //int k;
        return (int)r;
    }

    float ft;//data members can be declared anywhere in the class,
    //i..e even between methods or after methods
}

public class AccessSpecifierDemo {
    public static void main(String a[])
    {
        Test5 ot = new Test5((float)4.0,2.0f);

        ot.val1 = 6.0f;
        //ot.val2 = 3.0f; //error, val2 is private

        //ot.display(1.0f); //error, it is private and not visible

        float sum = ot.add();
        System.out.println("Added:"+sum);

        float mod = ot.modulo();
        System.out.println("Modulo:"+mod);

    }
}

