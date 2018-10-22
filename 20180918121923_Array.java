
package javaapplication1;
import java.util.Scanner;

public class Array {
     public static void main(String[] args) {
          Scanner console=new Scanner(System.in);
          int markcount;
          System.out.print("how many marks :");
          markcount=console.nextInt();
          int[] arr = new int[markcount];
        double total = 0;

        for(int i=0; i<markcount; i++){
            
            System.out.print("Please enter the marks "+(i+1)+": ");
            arr[i]=console.nextInt();
            
        	
                
        }
         System.out.print("The marks are  ");
          for(int i=0; i<markcount; i++){
              total = total + arr[i];
              System.out.print(arr[i]);
            if(i<(markcount-1)){
                System.out.print(",");
            }
           
          }

   
        double average = total / arr.length;
        
        
         System.out.println("");
        System.out.format("The average is: "+ average);
     }
    
}
