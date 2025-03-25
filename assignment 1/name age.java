import java.util.Scanner;

class Student {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student name:-");
        String studentName = s1.nextLine();
        System.out.println("Enter Student age:-");
        int studentAge = s1.nextInt();
        System.out.println("Student name is:-" + studentName);
        System.out.println("Student Age is:-" + studentAge);
    }
}