//leonardo xavier santana santos
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
      
        String[] nomes = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome " + (i + 1) + ":");
            nomes[i] = leitor.nextLine(); 
        }

        System.out.println("\n Nomes na Ordem Inversa ");
       
        for (int i = 4; i >= 0; i--) { 
            System.out.println(nomes[i]);
        }
      
      
        System.out.println("\n Primeiro e Último Nome ");  
        
      
        String primeiroNome = nomes[0]; 
        String ultimoNome = nomes[4];
        
        System.out.println("Primeiro nome armazenado: " + primeiroNome);
        System.out.println("Último nome armazenado: " + ultimoNome);
    
    }
}