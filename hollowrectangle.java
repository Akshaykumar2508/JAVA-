import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        for( int k= 1 ; k<=i ; k++)
        {
            if(k==1 || k==i){
                for(int p=1;p<=j;p++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }else{
                System.out.print("*");
                for(int t=1;t<j-1;t++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
    }
    
}
