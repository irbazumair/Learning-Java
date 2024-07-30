//Input currency in rupees and output in USD.
package lecture1.com;

import java.util.Scanner;

public class USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rupees: ");
        double num = Double.parseDouble(input.nextLine());
        double exchangerate = 74.83;
        double usd = num / exchangerate;
        System.out.println(num + " INR in USD equal to " + usd + " USD");
        input.close();

    }
}
