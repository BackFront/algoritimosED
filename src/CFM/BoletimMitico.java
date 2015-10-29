package CFM;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class BoletimMitico {

    /**
     * 04. Crie um NOVO projeto Java que contenha as seguintes classes:
     *
     * a)BoletimMitico: Usando vetor e while, solicite 4 notas ao usuário. Exiba
     * sua média e se foi aprovado (média >=7) ou reprovado. Exiba ainda a maior
     * e a menor nota.
     *
     * b) FrasesMiticas: Usando vetor e while, solicite 3 frases ao usuário.
     * Crie um segundo vetor que contenha as mesmas frases, mas todas em CAIXA
     * ALTA. Crie ainda outro vetor que contenha todas as frases com seus
     * conteúdos mexidos (troque "a" por "?" nas frases). Exiba os conteúdos dos
     * 2 vetores que criou por último.
     *
     * c) MasterChef: Usando vetor e while, pergunte ao usuário quantos
     * ingredientes a receita terá. Pergunte então o nome e preço de cada
     * ingrediente. Depois, exiba o custo total da receita. Depois, pergunte ao
     * usuário "Digite o nome de um ingrediente ou X para sair". Se ele digitar
     * "X" nada mais ocorre, caso contrário, procure pelo ingrediente no vetor e
     * exiba "Não encontrado" ou "Encontrado. Valor: R$ XX".
     *
     * @param args
     */
    public static void main(String[] args) {
        Double nota[] = new Double[5];

        int i = 0;
        nota[4] = .0;
        while (i < 4) {
            Scanner console = new Scanner(System.in);

            System.out.println("Digite a nota " + i);
            nota[4] += nota[i] = Double.parseDouble(console.nextLine());
            ++i;
        }

        double media = nota[4] / (nota.length - 1);

        if (media >= 7) {
            System.out.println("------------------");
            System.out.println("Parabens, Você foi aprovado com: " + media);
            System.out.println("------------------");
        } else {
            System.out.println("------------------");
            System.out.println("Você foi reprovado. Sua média é: " + media);
            System.out.println("------------------");
        }
    }
}
