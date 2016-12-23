/**
 * Created by Lazarus on 19.12.2016.
 */
public class Exercises6 {
// 1. What happens if you invoke a value method and don’t do anything with the result;
// that is, if you don’t assign it to a variable or use it as part of a larger expression?
    public static double Value(double x, double y){

        double result = x/y;
        return 0.0; //stub
    }
    public static void main(String[]args){
       System.out.print(Value(16.5, 15.3));

    }
}
