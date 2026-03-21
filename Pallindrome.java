import java.util.Scanner;
public class Pallindrome {
  public static void main(String[] args) {
    int num,rem,rev=0,original;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
          num=sc.nextInt();
           original = num;
             while(num > 0) {
              rem = num % 10;
              rev = rev * 10 + rem;
              num = num / 10;
             }
            if(original == rev)
             System.out.println("No. is a Pallindrome !");
            else
             System.out.println("No. is not Palindrome !");
           }
         }
              