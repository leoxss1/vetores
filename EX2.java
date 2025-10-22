// leonardo xavier santana santos
import java.util.Scanner;
public class EX2 {
  public static void main(String[] args) {

int [] numeros =  new int [10];
Scanner leitor= new Scanner(System.in);
System.out.println("digite 10 numero ");

for (int i = 0; i < 10; i++){
  numeros[i] = leitor.nextInt();
}

  for (int i = 0; i < 10; i++){
  if(numeros[i] % 2 == 0 ){  
   
    System.out.println("numero pares: " + numeros[i]); 
  }}
  for (int i = 0; i < 10; i++){
   if( numeros[i] % 2 !=0  ){
System.out.println("numeros impares: " + numeros[i]);
   
 }
}
  }
}