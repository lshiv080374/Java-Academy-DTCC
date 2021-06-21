package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String args[]) {
        /*
            Declare your code here!
         */

        boolean b = false;
        byte by = 6;
        char ch = 'c';
        short st = 5;
        int i = 10;
        long l = 7L ;
        float f = 8f;
        double d = 9.5;

        //Cast your int type into a new variable of type double

        double d1 = i;
        System.out.println ("Integer = " + i);
        System.out.println ("Integer cast into double = " + d1);

        //Multiply your float and original double type variable and store the result in a float

        float f1 = (float) (f*d);
        System.out.println ("Result stored as float = " + f1);

       // Perform the same steps as the last bullet, but store the value in an int instead, and note the result
        int j = (int) (f*d);
        System.out.println ("Result stored as Integer = " + j);

        //Declare a new char variable, cast it to an int and print the result
        char c = 'A';
        int k = c;
        System.out.println ("Char cast into Int = " + k);

    }
}
