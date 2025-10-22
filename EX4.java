// leonardo xavier santana santos
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        
    
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            A[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            B[i] = A[i] * 3;
        }
        
        System.out.println("\nElementos do vetor B (A multiplicado por 3):");
        for (int i = 0; i < 5; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
        
        leitor.close();
    }
}