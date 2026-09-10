import java.util.*;

class MaxSub {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int a=s.nextInt(),cur=a,max=a;

  for(int i=1;i<n;i++) {
   a=s.nextInt();
   cur=Math.max(a,cur+a);
   max=Math.max(max,cur);
  }

  System.out.println("Max Sum="+max);
 }
}