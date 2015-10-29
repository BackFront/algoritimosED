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
public class Pilha {

    private Lista list = new Lista();
    private int countElements = 0;

    public boolean isEmpty() {
        return (this.countElements <= 0);
    }

    public void push(String content) {
        Nodo no = new Nodo(content);
        this.list.add(no);
        ++this.countElements;
    }

    public String pop() {
        String temp = list.getFirst().getContent();
        this.list.remove(temp);
        return temp;
    }
}
