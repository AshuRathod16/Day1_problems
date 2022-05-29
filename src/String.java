import java.util.Scanner;
public class String {
    public static void main(String args[]) {
        java.lang.String string1;
        java.lang.String string2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");
        string1 = scanner.nextLine();

        System.out.println("Enter second String");
        string2 = scanner.nextLine();

        if (string1 == string2) ;
        System.out.println("Equal String");
        else
        {
            System.out.println("Not equal String");
        }

    }

}
