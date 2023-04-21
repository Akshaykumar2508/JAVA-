import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter Operator(+,-,%,/,*):");
        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                int Sum = a + b;

                System.out.println(Sum);
                break;
            case '-':
                int Difference = a - b;

                System.out.println(Difference);
                break;
            case '*':

                int Mul = a * b;
                System.out.println(Mul);

                break;

            case '%':

                int Mod = a % b;
                System.out.println(Mod);
                break;
            case '/':

                int Div = a / b;
                System.out.println(Div);
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}
