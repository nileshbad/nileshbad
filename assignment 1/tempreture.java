import java.util.Scanner;

class Temperature {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter fahreheit to convert celciuse");
        float fahreheit = s1.nextFloat();
        float celciuse = (fahreheit - 32) * 5 / 9;
        System.out.println(" fahreheit to convert celciuse temperature is: " + celciuse);
    }
}
