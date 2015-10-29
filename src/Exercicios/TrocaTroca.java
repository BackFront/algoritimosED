package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class TrocaTroca {

    /**
     * 02. Crie uma classe Java chamada "TrocaTroca". Ao ser executada, ele
     * solicita que o usuário digite uma frase. Logo em seguida solicite ao
     * usuário "Pelo que quer procurar". Por fim, solicite "Trocar pelo que". Ao
     * final, exiba a frase com os termos trocados, conforme o que o usuário
     * solicitou.
     */
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String FraseIni = lerdados.nextLine();

        System.out.println("Digite o que deseja procurar:");
        String Find = lerdados.nextLine();

        System.out.println("Pelo o que gostaria de alterar na frase principal?:");
        String Replace = lerdados.nextLine();

        System.out.println("--------------------------------------------------:");

        System.out.println("A frase final ficou:" + FraseIni.replace(Find, Replace));
    }
}
