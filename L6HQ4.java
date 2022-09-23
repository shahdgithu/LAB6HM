
import java.util.Scanner;
public class L6HQ4 {
        public static void main(String[] args) {
            String s;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter word : ");
            s=in.next();
            char[] sh=s.toCharArray();
            StringBuilder builder=new StringBuilder();
            for (int i=sh.length-1;i>=0;i--) {
              builder.append(sh[i]);
            }
            String s1=builder.toString();
            System.out.print(s);
        }
    }


