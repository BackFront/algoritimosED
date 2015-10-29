package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class BoletimSimples {

    /**
     * 03. Crie uma classe chamada "BoletimSimples" Solicite o nome do aluno, 3
     * notas, o número de aulas que ocorreram e o número de faltas do aluno.
     * Exiba: Seu nome é NONO, sua média foi MMM e sua frequencia foi FF%. Note
     * que você deve exibir a porcentagem da frequencia. Ex: Total de aulas: 100
     * e 25 faltas. A frequencia que deve aparecer é 75%.
     */
    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String NomeAluno = lerdados.nextLine();

        System.out.println("Digite a nota 01:");
        String Nota1 = lerdados.nextLine();
        Double DNota1 = Double.parseDouble(Nota1);

        System.out.println("Digite a nota 02:");
        String Nota2 = lerdados.nextLine();
        Double DNota2 = Double.parseDouble(Nota2);

        System.out.println("Digite a nota 03:");
        String Nota3 = lerdados.nextLine();
        Double DNota3 = Double.parseDouble(Nota3);

        System.out.println("Digite a quantidade de aulas:");
        String Aulas = lerdados.nextLine();
        Integer IAulas = Integer.parseInt(Aulas);

        System.out.println("Digite a quantidade de faltas:");
        String Faltas = lerdados.nextLine();
        Integer IFaltas = Integer.parseInt(Faltas);

        System.out.println("-------------------------------");

        Double Media = (DNota1 + DNota2 + DNota3) / 3;
        int Frequencia = 100 - ((IFaltas * 100) / IAulas);

        System.out.println("Seu nome é: " + NomeAluno);
        System.out.println("Sua média é: " + Media);
        System.out.println("Sua frequência foi: " + Frequencia + "%");

    }
}
