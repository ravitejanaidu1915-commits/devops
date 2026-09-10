import java.util.*;

class Calculator {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt(),b=s.nextInt();

  System.out.println("Add="+(a+b));
  System.out.println("Sub="+(a-b));
  System.out.println("Mul="+(a*b));
  System.out.println("Div="+(a/b));
 }
}