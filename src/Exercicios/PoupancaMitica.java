package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class PoupancaMitica {
    private static int vlDeposito;

    /**
     * 09. Crie um novo projeto Java ou novas classes no projeto atual que
     * implementem o seguinte cenário.
     *
     * Classe "ProgramaPoupancaMitica", que deve ter um método "depositar" que
     * recebe como parâmetros o saldo atual, o valor do próximo depósito e a
     * taxa de juros (%). Ele deve devolver o novo valor do saldo da poupança,
     * sendo que o cálculo consiste em: ((valor atual + depósito) + taxa de
     * juros (em %)) - desconto de Imposto de renda (vide método "calcularIR").
     *
     * Método "calcularIr" recebe o saldo atual de uma poupança e retorna o
     * valor do Imposto de Rende sobre ele, como a seguir: Se saldo>=5000, 3% do
     * saldo, senão, 0%.
     *
     * No main, pergunte ao usuário o valor do depósito e a taxa de juros
     * infinitas vezes, até que o depósito seja 0 (zero). Ao final, exiba o
     * saldo na poupança. Considere que a poupança começa zerada.
     *
     * @param args
     */
    private float saldo;

    private float CalculoIr() {
        if (this.saldo >= 5000) {
            return 3 * this.saldo / 100;
        }
        return 0;
    }

    public void depositar(float valor) {
        this.saldo += valor + this.CalculoIr();
    }

    public static void main(String[] args) {
        PoupancaMitica itau = new PoupancaMitica();
        Scanner console = new Scanner(System.in);

        float vld = 0;
        do {
            System.out.println("Quanto deseja deposiitar?");
            vld = Float.parseFloat(console.nextLine());
            
            if (vld != 0) {
                itau.depositar(vld);
                System.out.println("-----------------");
                System.out.println("Você depositou: R$" + vld);
                System.out.println("-----------------");

            } else {
                System.out.println("--");
                System.out.println("Seu saldo é: " + itau.saldo);
                System.out.println("Obrigado. Volte sempre!");
            }

        } while (vld != 0);
    }
}
