package func;
import java.util.Scanner;

public class tan2 {
    public static double tanCordic(double num1){
        return 1;
    }


    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your x for us to calculate tan(x) for you:");
                double inVal = input.nextDouble();
                System.out.println(inVal);
            }catch(java.util.InputMismatchException e){
                System.out.println("Please input numbers only!");
            }
            }
        }
}
