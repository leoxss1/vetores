// leonardo xavier santana santos
import java.util.Scanner;

public class EX5{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;
        
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];
        
       
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = leitor.nextInt();
        }
       
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = leitor.nextInt();
        }
        
       
        for (int i = 0; i < tamanho; i++) {
            C[i] = A[i] - B[i];
        }
        
        
        System.out.println("\nVetor C (A - B):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
