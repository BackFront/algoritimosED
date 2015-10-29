package CFM;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class FrasesMiticas {

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
        int i = 0;

        String frase[] = new String[3];
        String fraseUppercase[] = new String[3];
        String fraseCifrada[] = new String[3];

        while (i < 3) {
            Scanner console = new Scanner(System.in);

            System.out.println("Digite uma frase.");
            String linha = console.nextLine();
            frase[i] = linha;
            fraseUppercase[i] = linha.toUpperCase();
            fraseCifrada[i] = linha.replace("a", "@");

            ++i;
        }

        for (int j = 0; j < frase.length; j++) {
            System.out.println("------------------------------------");
            System.out.println("[ " + fraseUppercase[j] + " ]");
            System.out.println("[ " + fraseCifrada[j] + " ]");
            System.out.println("------------------------------------");
        }
    }
}
