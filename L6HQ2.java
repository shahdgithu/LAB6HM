import java.util.Scanner;
public class L6HQ2 {

       public static void main(String[] args) {
           int sum1=0,s,h,sum2=0,a;
            for (int i=2;i<=100;i++)
            {if(i%2==0)
            { sum1=sum1+i;}
            }
            System.out.println("sum1="+sum1);
            Scanner in=new Scanner(System.in);
            System.out.println("enter 2  numbers ");
            s=in.nextInt();
            h=in.nextInt();
            for (int i=s;i<=h;i++)
            {if(i%2!=0)
            { sum2=sum2+i;}
            }System.out.println("sum1="+sum2);


        }}


