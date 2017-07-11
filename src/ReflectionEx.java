import java.lang.reflect.*;

class Abcd
{
    public Abcd()
    {
        System.out.println("This is Constructor");
    }

    public void met1() throws Exception
    {

        System.out.println("This is met1()");
    }

    public void met2(String str) throws Exception
    {

        try {
            System.out.println("This is met2(String) "+str);
        }  catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void met3(String str1,String str2) throws Exception
    {

        try {
            System.out.println("This is met3(String, String) "+str1+" "+str2);
        }  catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ReflectionEx {
    public static void main(String args[])
    {
        try
        {
            //no parameters
            Class no_params[] = {};

            //get the Class instance of Abcd
            Class c = Class.forName("Abcd");

            //get the Constructor instance
            Constructor cons = c.getConstructor(no_params);

            //create object, which is required for invoke() method
            Object obj = cons.newInstance();

            Method mta[] = c.getMethods();

            System.out.println("Below are the methods in Abcd class");

            for(Method mt:mta)
            {
                System.out.println("Method : " + mt.getName());

                if(!(mt.getName().startsWith("met"))) {
                    continue;
                }
                Class mpt[] = mt.getParameterTypes();
                Object params[] = new Object[mpt.length];

                int i = 0;
                for(Class x : mpt) {
                    System.out.println("Parameter Type : " + x.getName());
                    if(x.getName().endsWith("String")) {
                        params[i++] =  "str" + i;
                    }
                }
                mt.invoke((Abcd)obj, params);

                System.out.println("Exceptions are : ");

                Class exp[] = mt.getExceptionTypes();

                for(Class x : exp) {
                    System.out.println(x.getName());
                }
            }

            Method method1 = c.getDeclaredMethod("met1",no_params);

            //Now, invoke method dynamically
            method1.invoke((Abcd)obj);

            //one String parameter
            Class str_params[] = {String.class};
            Method method2 = c.getDeclaredMethod("met2", str_params);

            Object obj11[] = new Object[1];
            obj11[0] = "fsdfsd";
            //Now, invoke method dynamically
            method2.invoke((Abcd)obj, obj11);

            //one String parameter
            Class str_str_params[] = {String.class, String.class};
            Method method3 = c.getDeclaredMethod("met3", str_str_params);
            //method3.
            //Now, invoke method dynamically
            method3.invoke((Abcd)obj, "First Param", "Second Param");
        }catch(ClassNotFoundException cnf)
        {
            cnf.printStackTrace();
        }
        catch(NoSuchMethodException nsm)
        {
            nsm.printStackTrace();
        }
        catch(Exception ec)
        {
            ec.printStackTrace();
        }
    }
}
