import java.util.*;
public class solidrectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        for( int k= 0 ; k<i ; k++)
        {
            for( int p = 0 ; p<j;p++){
                System.out.print('*');
            }System.out.print("\n");

        }
    }
}
