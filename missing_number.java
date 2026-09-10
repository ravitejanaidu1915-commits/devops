import java.util.*;

class Missing {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),sum=0;

  for(int i=0;i<n-1;i++)
   sum+=s.nextInt();

  int total=n*(n+1)/2;
  System.out.println("Missing="+(total-sum));
 }
}