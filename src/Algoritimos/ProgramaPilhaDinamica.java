package Algoritimos;

/**
 *
 * @author Douglas
 */
public class ProgramaPilhaDinamica {

    public static void main(String[] args) {
        /*Lista minhaLista = new Lista();
         Nodo no1 = new Nodo("Hello World");
         Nodo no2 = new Nodo("We're anonymous");
         Nodo no3 = new Nodo("Por baixo desta mascara existe um ideal e ideias sao a prova de balas");

         minhaLista.add(no1);
         minhaLista.add(no2);
         minhaLista.add(no3);

         minhaLista.remove("Hello World");
         */

        Pilha a = new Pilha();

        a.push("teste01");
        a.push("teste02");
        a.push("teste03");
        
        System.out.println(a.pop());
    }
}
