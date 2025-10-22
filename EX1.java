 // leonardo xavier santana santos
 import java.util.Scanner;
public class EX1 {
  public static void main(String[] args) {

int [] numeros =  new int [10];
Scanner leitor= new Scanner(System.in);
for (int i = 0; i < 10; i++){
    System.out.println("digite um numero " + (i+1));
    numeros[i] = leitor.nextInt();
}for (int i = 0; i < 10; i++) {
    System.out.println("numero: " + (i + 1) + " = " + numeros[i]);
    
}
}
}