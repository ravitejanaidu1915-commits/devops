import java.util.*;

class Reverse {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  String x=s.nextLine(),r="";

  for(int i=x.length()-1;i>=0;i--)
   r+=x.charAt(i);

  System.out.println(r);
 }
}