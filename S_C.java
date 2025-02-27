import java.util.Scanner;

class S_C{
    public static void main (String [] args){
        Scanner su = new Scanner(System.in);
        System.out.println("Enter number b/w (1-3): ");
        int x = su.nextInt();
        su.close();

        switch (x) {
            case 1:
                System.out.println("You won gold medel");
                break;
            case 2:
                System.out.println("You won silver medel");
                break;
            case 3:
                System.out.println("You won browine medel");
                break;
        
            default:
            System.out.println("Enter number only b/w (1-3)");
                break;
        }

    }
}
