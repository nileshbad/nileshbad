import java.util.Scanner;

class UserId {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        String personeName = "jakes";
        int personeAge = 35;
        System.out.println("Enter  UserId");
        int id = 151;
        int userId = s1.nextInt();
        if (userId == id) {
            System.out.println("Name:-" + personeName);
            System.out.println("Age:-" + personeAge);
        } else {
            System.out.println("Not Found id");
        }
    }
}