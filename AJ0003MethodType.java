/*
 * Advane Java code
 * by:- mahi raunak
 * date:- 08/11/2022
 * topic:- Example of method with or without argument and with or without return type.
 */
public class AJ0003MethodType {
    int fact(int a) {
        if (a == 1 || a == 0)
            return 1;
        else {
            int fac = 1;
            for (int i = a; i > 1; i--) {
                fac = fac * i;
            }
            return fac;
        }
    }

    void max(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                System.out.println(a + " is largest number");
            else
                System.out.println(c + " is largest number");
        } else {
            if (b > c)
                System.out.println(b + " is largest number");
            else
                System.out.println(c + " is largest number");
        }
    }

    int add(int a, int b) {
        return a + b;
    }
    /*
     * int get(){}
     * void show(){}
     * 
     * void cube(int a){}
     * int getData(){}
     * void display(){}
     * float sum(float a, float b){}
     * boolean getBoolean(){}
     */

    public static void main(String[] args) {
        AJ0003MethodType aj0003MethodType = new AJ0003MethodType();
        System.out.println(aj0003MethodType.fact(5));
        aj0003MethodType.max(5, 4, 2);
        System.out.println(aj0003MethodType.add(5, 7));
    }

}
