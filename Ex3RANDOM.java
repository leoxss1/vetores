//Leonardo xavier santana santos
import java.util.Random;
public class Ex3RANDOM {
    public static void main(String[] args) {
        Random leitor = new Random();
        int[] numeros = new int[10];
        int menor;

       
        for (int i = 0; i < 10; i++) {
            numeros[i] = 10 - leitor.nextInt(10); 
        }

        menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Números sorteados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("O menor número é: " + menor);
    }
}

