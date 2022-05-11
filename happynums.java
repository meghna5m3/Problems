import java.io.IOException;
import java.util.*;

public class Main
{
    static int happyNumber(int num){
        int temp=num,sum=0,rem=0;
        while(temp>0){
            rem=temp%10;
            sum+=Math.pow(rem,2);
            temp/=10;
        }
        return sum;
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<n;i++){
   int result=a[i];
    while(result!=1&&result!=4){
       result=happyNumber(result);
    }
            if(result==1)
                count++;
}
System.out.println(count);
}
}
