
package berlian;

import java.util.Scanner;


public class day4_stdin_and_stdout_II_java {
    public static void main(String[] args) {
        public static void main(String[] args) {
        int i;
        double d;
        String s;
        try (Scanner scan = new Scanner(System.in)) {
            i = scan.nextInt();
            d = scan.nextDouble();
            scan.nextLine();
            s = scan.nextLine();
        }

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
    
    

