import java.util.Scanner;
public class L6HQ7 {
        public static void main(String args[]) {
            Scanner sh=new Scanner(System.in);
            System.out.println("enter number");
            int a=sh.nextInt();
            int c=a;
            while (c!=0){
                System.out.println(c%2);
                c/=2;
            }
        }
    }


