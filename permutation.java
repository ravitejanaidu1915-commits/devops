import java.util.*;

class PC {
 static int f(int n) {
  int x=1;
  for(int i=1;i<=n;i++) x*=i;
  return x;
 }

 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),r=s.nextInt();

  System.out.println("P="+f(n)/f(n-r));
  System.out.println("C="+f(n)/(f(r)*f(n-r)));
 }
}