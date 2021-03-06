/**
 * Created by Lazarus on 23.12.2016.
 *
  If you are given three sticks, you may or may not be able to arrange them in a triangle.
  For example, if one of the sticks is 12 inches long and the other two are one inch long,
  you will not be able to get the short sticks to meet in the middle. For any three lengths,
  there is a simple test to see if it is possible to form a triangle:

 If any of the three lengths is greater than the sum of the other two, you cannot form
 a triangle.

 Write a method named isTriangle that takes three integers as arguments and returns
 either true or false, depending on whether you can or cannot form a triangle from
 sticks with the given lengths. The point of this exercise is to use conditional
 statements to write a value method.
 *
 */
public class Exercise6_3 {
    public static boolean isTriangle(int a, int b, int c){
        if (a >(b+c) || b >(a+c)|| c >(b+a)){
            System.out.print("Sorry, kuid nendest ei saa kolmnurka moodustada");
            return false;
        }
        else {
            System.out.print("Jee, nendest saab kolmnurka moodustada!");
            return true;
        }
    }
    public static void main(String[]Args){
        isTriangle(8,4,5);
    }

}
