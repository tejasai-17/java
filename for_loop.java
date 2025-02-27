import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = ob.nextInt();
        ob.close();
        int sum = 0;

        for(int y=x;y<=10;y++){
            sum = sum + y;
        }
        System.out.println("The sum: "+ sum);
    }
}
