//Take name as input and print a greeting message for that particular name.
package lecture1.com;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name + " I Love You ");

    }
}
