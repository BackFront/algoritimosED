package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class CadastroSimples {

    /**
     * 01. Crie uma classe Java chamada "CadastroSimples". Solicite ao usuário o
     * nome, a idade e a altura. Depois exiba a seguinte saida: Seu nome é NONO.
     * O dobro de sua idade é III e a metade de sua altura é AAA.
     */
    public static void main(String[] args) {

        Scanner lerdados = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String Nome = lerdados.nextLine();

        System.out.println("Digite sua idade:");
        String Idade = lerdados.nextLine();
        int IIdade = Integer.parseInt(Idade);

        System.out.println("Digite sua altura:");
        String Altura = lerdados.nextLine();
        Double DAltura = Double.parseDouble(Altura);

        System.out.println("-------------------------------");

        System.out.println("Seu nome é " + Nome);
        System.out.println("O dobro da sua idade é " + (IIdade * 2));
        System.out.println("A metade da sua altura é " + (DAltura / 2));

    }
}
