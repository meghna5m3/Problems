import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int prev=-1;
      boolean f=true;
      while(sc.hasNext())
      {
          int n=sc.nextInt();
          if(n<prev)
          {
              System.out.println(prev+1);
              f=false;
              break;
          }
          prev=n;
      }
      if(f) System.out.println(prev+1);  
    }
}
