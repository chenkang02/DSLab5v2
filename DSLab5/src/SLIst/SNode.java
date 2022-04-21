/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slist;

/**
 *
 * @author Chen Kang
 */
public class SNode<E> {
    E element;
    SNode<E> next; 
    SNode<E> prev; 
    
    public SNode(){
        
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public SNode<E> getNext() {
        return next;
    }

    public void setNext(SNode<E> next) {
        this.next = next;
    }

    public SNode<E> getPrev() {
        return prev;
    }

    public void setPrev(SNode<E> prev) {
        this.prev = prev;
    }
    
    public SNode(E element, SNode next, SNode prev){
        this.element = element; 
        this.next = next;
        this.prev = prev; 
    }
    
    
}
