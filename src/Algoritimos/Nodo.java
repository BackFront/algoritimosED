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
public class Nodo {

    private String content;
    private Nodo Next;

    public Nodo(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo proximo) {
        this.Next = proximo;
    }

}
