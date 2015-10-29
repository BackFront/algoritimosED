package CFM;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Douglas
 */
public class MasterChef {

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
        Scanner console = new Scanner(System.in);
        System.out.println("Quantos ingredientes a receita tera?");
        int quantIngredientes = Integer.parseInt(console.nextLine());

        String[] nome = new String[quantIngredientes];
        Double[] preco = new Double[quantIngredientes];
        Double total = .0;

        for (int i = 0; i < quantIngredientes; ++i) {
            System.out.println("--");
            System.out.println("Qual ingrediente nº" + (i + 1));
            nome[i] = console.nextLine();
            System.out.println("Qual o valor do ingrediente?");
            total += preco[i] = Double.parseDouble(console.nextLine());
        }

        System.out.println("---------------------------------");
        System.out.println("O valor total gasto em ingredientes foi: " + total);

        String Action = null;

        do {
            System.out.println("---------------------------------");
            System.out.println("Digite o nome de um ingrediente ou X para sair");
            Action = console.nextLine();

            if (!"X".equals(Action)) {
                int indexArray = Arrays.asList(nome).indexOf(Action);

                if (indexArray <= nome.length || indexArray >= 0) {
                    System.out.println("--");
                    System.out.println("O ingrediente " + nome[indexArray] + ", tem o valor de " + preco[indexArray]);
                } else {
                    System.out.println("Ingrediente não encontrado");
                }
            } else if ("X".equals(Action)) {
                System.out.println("---------------------------------");
                System.out.println("Programa Finalizado com Sucesso!");
            }
        } while (!"X".equals(Action));
    }
}
