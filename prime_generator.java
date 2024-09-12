import java.util.Scanner;
public class main {
    static boolean primeCheck(int a) {
        int w = 2;
        int i = 2;
        while (i < a) {
            if (a != w) {
                double aOverW = (double) a / w;
                int intAOverW = a / w;
                if (Math.abs(aOverW-intAOverW) < 0.0000001) {
                    return false;
                }
            }
            w ++;
            i ++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("This Java program outputs primes from 2 to a maximum");
        System.out.println("Enter a maximum");
        Scanner myObj = new Scanner(System.in);
        int maxVar = myObj.nextInt();
        int limitVar = 2;
        while (limitVar<=maxVar) {
            boolean z = primeCheck(limitVar);
            if (z) {
                System.out.println(limitVar);
            }
            limitVar += 1;
        }
    }
}
