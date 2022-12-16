import java.util.Scanner;

/*Faça um programa que peça N números inteiros 
Calcule  e mostre a quantidade de números pares e ímpares
/* /* */
public class Ex3_ParEImpar {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
    
    
        System.out.println("Quantidade de números");
        quantNumeros = scan.nextInt();

        int count = 0;
        do  {
            System.out.println("número");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count ++;  //ou count = count + 1;
      
        } while(count < quantNumeros);
        System.out.println("Quantidade de números Pares : " + quantPares);
        System.out.println("Quantidade de números Ímpares : " + quantImpares);   

    }
}
