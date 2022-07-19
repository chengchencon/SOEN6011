package func;

import java.util.Scanner;
import java.math.*;
public class tan1 {
    double pi = 3.1415926536;
    public static double pw(double num1,int num2)
    {
        int count=num2-1;
        double out = num1;
        while(count>0)
        {
            out*=num1;
            count--;
        }
        return out;
    }
    //tanx = tanx=x+x^3/1*3+2*( x^5)/1*3*5
    //tanx is good before 78
    public static double tan(double num1){
        double out;
        out = num1 + pw(num1,3)/3 + 2*pw(num1,5)/15 + 17*pw(num1,7)/315 + 62*pw(num1,9)/2835 + 1382*pw(num1,11)/155925 + 21844*pw(num1,13)/6081075 +929569*pw(num1,15)/638512875;
        return out;
    }

    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your x for us to calculate tan(x) for you:");

                double inVal = input.nextDouble();
                //val is 1.57079632679~ -1.57079632679 pi is 3.14159265359
                while (inVal > 1.57079632679)
                    inVal -= 1.57079632679;
                while (inVal < -1.57079623679)
                    inVal += 1.57079632679;
                if (inVal < 1.377 && inVal > -1.377) {
                    double out = tan(inVal);
                    System.out.println(out);
                    System.out.println(Math.tan(inVal));
                } else {
                    double newInval = inVal / 2.0;
                    double out2 = 2.0 * tan(newInval) / (1 - tan(newInval) * tan(newInval));
                    System.out.println(out2);
                    System.out.println(Math.tan(inVal));
                }

            }
            catch(java.util.InputMismatchException e){
                System.out.println("Please input numbers only!");
            }
        }
    }
}
