package func;
import java.util.Scanner;
import java.math.*;

public class tan1 {
    double pi = 3.1415926536;
    //pw function is for calculating num1 power num2
    public static double pw(double num1,int num2)
    {
        int count=num2 - 1;
        double out = num1;
        while(count > 0)
        {
            out*=num1;
            count--;
        }
        return out;
    }
    //tanx = tanx=x+x^3/1*3+2*( x^5)/1*3*5
    public static double tan(double num1){
        double out;
        //taylor serie of tan(x)
        out = num1 + pw(num1 , 3) / 3 + 2 * pw(num1 , 5) / 15 + 17 * pw(num1 , 7)/315 + 62 * pw(num1 , 9)/2835 + 1382 * pw(num1 , 11)/155925 + 21844 * pw(num1 , 13)/6081075 +929569 * pw(num1 , 15)/638512875;
        return out;
    }

    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your x for us to calculate tan(x) for you:");
                double inVal = input.nextDouble();
                //make sure inVal is between 1.57079623679 and -1.57079623679
                while (inVal > 1.57079632679)
                    inVal -= 1.57079632679;
                while (inVal < -1.57079623679)
                    inVal += 1.57079632679;
                if (inVal < 1.377 && inVal > -1.377) {
                    double out = tan(inVal);
                    System.out.println(out);
                }
                //the result may have some accuracy loss when it is between 1.377 and 1.57079632679,
                //therefore, make the transformation of tan(x) to make its accuracy higher
                else
                {
                    double newInval = inVal / 2.0;
                    double out2 = 2.0 * tan(newInval) / (1 - tan(newInval) * tan(newInval));
                    System.out.println(out2);
                }
            }
            catch(java.util.InputMismatchException e)
            {
                System.out.println("Please input numbers only!");
            }
        }
    }
}
