import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = ob.nextInt();
        ob.close();
        int sum = 0;

        while (x<=10) {
            sum = sum + x;
            x++;
        }
        System.out.println("The sum: "+ sum);
    }
}