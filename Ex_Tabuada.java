import java.io.StringReader;
import java.util.Scanner;

/*
Crie um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
a saída deve ser conforme o exemplo abaixo.
Tabuada de 5:
5 X 1 = 5;
5 X 2  = 10;
....
5X 10 = 50
*/
public class Ex_Tabuada {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual Tabuada você deseja?  ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada " + tabuada);

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + "X" + i + " = " + (tabuada * i));
        }

    }
}
