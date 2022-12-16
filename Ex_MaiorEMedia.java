import java.util.Scanner;

public class Ex_MaiorEMedia {
   private static int count;

/*Faça um programa que leia 5 número, informe o maior deles
/*e a média desses 5 números.

/**
 * @param args
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int maior = 0;
    int soma = 0;

    int count = 0;
    do {
        System.out.println("Número: ");
        numero = scan.nextInt();
        
        soma= soma + numero;
        
        if (numero > maior) maior = numero;    
   
        count = count +1;
    } while(count < 5);

   
    System.out.println("O número maior é : "+ maior);
    System.out.println("A média dos 5 números é: " + (soma/ 5));
  }
}
