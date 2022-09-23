import java.util.Scanner;
public class L6HQ5 {
        public static void main(String[] args) {
            String s;
            Scanner in=new Scanner(System.in);
            System.out.println("enter  word : ");
           s =in.next();
            int c=0;
            for (int a=0;a<s.length();a++)
            {
                char r = s.charAt(a);
                if(r=='a'||r=='o'||r=='i'||r=='e'||r=='u'||r=='y')
                    c++;
            }
            System.out.println(c);
        }
    }



