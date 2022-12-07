/*
 * Advane Java code
 * by:- mahi raunak
 * date:- 07/11/2022
 * topic:- addition of two numbers using methods
 */
public class AJ0001Demo {
    int add(int a, int b) {            //method for addition and return type is int so its return c value
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int x = new AJ0001Demo().add(23, 45);               //creating the constructor of the AJ0001Demo class and calling the method
        System.out.println(x);
        AJ0001Demo aj0001Demo = new AJ0001Demo();           //creating the object of class 
        int y = aj0001Demo.add(93, 23);                     //calling the method of the class
        System.out.println(y);
    }
}
