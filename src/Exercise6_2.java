/**
 * Created by Lazarus on 23.12.2016.
 */
public class Exercise6_2 {
    public static boolean isDivisible(int n, int m){
        if (n % m ==0){
            System.out.print("true");
            return true;
        }
        else {
            System.out.print("false");
            return false;
        }
    }
    public static void main(String[]Args){

        isDivisible(4,4);

    }
}
