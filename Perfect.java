import java.util.*;

public class Perfect{

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int sum=0, i=1;
       while(i<=n/2){

       if(n%i == 0){

          sum +=i;

         }
         i++;
      }
      if(sum == n){
        System.out.println("The number is Perfect");
     }
     else{
       System.out.println("The number is not perfect");
   }

    }

}