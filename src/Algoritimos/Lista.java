/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritimos;

/**
 *
 * @author Douglas
 */
public class Lista {

    private Nodo First;
    private Nodo Last;

    public Nodo getFirst() {
        return First;
    }

    public void setFirst(Nodo first) {
        First = first;
    }

    /**
     * Recupera e retorna o tamanho da lista
     *
     * @return int Size (Tamanho da lista)
     */
    public int getSize() {
        if (First == null) {
            return 0;
        }
        int Size = 1;
        Nodo NodoCurrent = this.First;
        while (NodoCurrent.getNext() != null) {
            ++Size;
            NodoCurrent = NodoCurrent.getNext();
        }
        return Size;
    }

    public void create() {
        this.First = null;
    }

    /**
     * Verifica se a lista está vazia
     *
     * @return bool true/false
     */
    public boolean isEmpty() {
        if (this.First == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adiciona um novo nó no inicio da lista
     *
     * @param Topo = Nodo a ser adicionado
     */
    public void add(Nodo Nodo) {
        Nodo.setNext(this.First);
        this.setFirst(Nodo);
    }

    public void remove(String i) {
        /*objeto para o elemento anterior*/

        Nodo anterior = null;
        /*objeto para percorrer a lista*/
        Nodo p = this.First;

        /*procura elemento na lista, guardando anterior*/
        while (p != null && !p.getContent().equals(i)) {
            anterior = p;
            p = p.getNext();
        }
        /*verifica se achou elemento*/
        if (p == null) {
            /*nao achou: mantem prim da forma como estah*/
            return;
        }
        /*retira elemento*/
        if (anterior == null) {
            /*retira elemento do inicio*/
            this.First = p.getNext();
        } else {
            /*retira elemento do meio da lista*/
            anterior.setNext(p.getNext());
        }
    }

    /**
     * busca por um elemento na lista
     */
    public Nodo search(String element) {
        for (Nodo n = this.getFirst(); n != null; n = n.getNext()) {
            if (n.getContent() == element) {
                return n;
            }
        }
        return null; /* nao achou o elemento */

    }

}
