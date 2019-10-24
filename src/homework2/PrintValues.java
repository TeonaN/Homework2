package homework2;

import java.io.File;
import java.util.Scanner;

public class PrintValues {

    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("Function.txt"));
        } catch (Exception ex) {
            System.exit(0);
        }

        double min = input.nextDouble();
        double max = min;

        while(input.hasNextDouble()) {
            double num = input.nextDouble();
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}