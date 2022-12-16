
import java.util.Scanner;

/*Faça um programa que pe,ca uma nota, entre zero dez.
 * Mostre uma mensagem caso o valor seja inválido 
 *e continue pedindo 
 * até que o usuário informe o valor válido.
 /* */
public class Ex1_Nota {
  
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
        
            int nota;
           
            System.out.print("Escreva sua nota na fé: ");
            nota = scan.nextInt();
            System.out.println("Escreveu uma nota válida parabéns!");
        
        
        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");

            nota= scan.nextInt();
        }
        }
        
    }
}
