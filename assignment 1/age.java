import java.util.Scanner;

class InputAge {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter StudentAge:-");
        int age = s1.nextInt();
        System.out.println("Student age is:-" + age);
        System.out.println("Increased Student Age is :-" + (++age));
    }
}