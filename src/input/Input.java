package input;

import java.util.Scanner;

public class Input {

    static Scanner sc = new Scanner(System.in);


    public static int getNumber() {
        int number = sc.nextInt();
        return number;
    }

    public static String getString() {
        String inputString = sc.nextLine();
        return inputString;
    }
}
