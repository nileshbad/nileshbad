import java.util.Scanner;

class Input2_Number_Sum {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any two number for sum");
        int number1 = s1.nextInt();
        int number2 = s1.nextInt();
        System.out.println("Sum is:" + (number1 + number2));
    }
}
