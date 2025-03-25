import java.util.Scanner;

class multiplication {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any two number for multiplication");
        int number1 = s1.nextInt();
        int number2 = s1.nextInt();
        System.out.println("Multiplication is:" + (number1 * number2));
    }
}