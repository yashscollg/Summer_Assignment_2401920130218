import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose User Type:");
        System.out.println("1. Kid User");
        System.out.println("2. Adult User");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            KidUser kid = new KidUser();

            System.out.print("Enter Age: ");
            kid.age = sc.nextInt();
            sc.nextLine();

            kid.registerAccount();

            System.out.print("Enter Book Type: ");
            kid.bookType = sc.nextLine();

            kid.requestBook();

        } else if (choice == 2) {
            AdultUser adult = new AdultUser();

            System.out.print("Enter Age: ");
            adult.age = sc.nextInt();
            sc.nextLine();

            adult.registerAccount();

            System.out.print("Enter Book Type: ");
            adult.bookType = sc.nextLine();

            adult.requestBook();

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}