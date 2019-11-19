package array1dnº3;
import java.util.Scanner;

public class Array1Dnº3 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int[] num = new int[10];
            for (int i = 0; i < 10;i++){
                System.out.print("Elemento nº" + (i + 1) + ": ");
                num[i]= teclado.nextInt();
                
            }
            
            for (int i = 9; i >= 0; i--){
                System.out.print(num[i]+" ");
                
            }
            
            
        
    }
    
}
