package func;
import java.util.Scanner;
import java.math.*;
//tan(a+b)=(tana+tanb)/(1-tana*tanb)
public class tan2 {
    public static double tanApart(double num1){
        double out=0;
        while(num1>0){
            out= (out+0.010000333346667207)/(1-out*0.010000333346667207);
            num1-=0.01;
        }

        return out;
    }


    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your x for us to calculate tan(x) for you:");
                double inVal = input.nextDouble();
                while(inVal>1.57079632679)
                {
                    inVal+=-1.57079632679;
                }
                while(inVal<-1.57079632679)
                {
                    inVal += 1.57079632679;
                }
                System.out.println(tanApart(inVal));
                System.out.println(Math.tan(inVal));

            }catch(java.util.InputMismatchException e){
                System.out.println("Please input numbers only!");
                }

            }
        }
}
