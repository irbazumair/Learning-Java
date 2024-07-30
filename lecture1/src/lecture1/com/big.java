//Take 2 numbers as input and print the largest number
package lecture1.com;

import java.util.Scanner;

public class big {
    public static void main(String[] args) {
        System.out.println("Enter first number : ");
        Scanner input = new Scanner(System.in);
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter second number :");
        int num2 = Integer.parseInt(input.nextLine());

        if (num1 > num2){
            System.out.println(num1 + " is the largest number");
        } else {
            System.out.println(num2 + " is the largest number");
        }

        input.close();
    }
}
