/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slist;

import java.util.NoSuchElementException;

/**
 *
 * @author Chen Kang
 */
public class SList<E> extends SNode<E> {
    private SNode<E> head, tail;
    private int size; 
    
    public SList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void appendEnd(E e){
        SNode<E> temp = new SNode<E>(e, null, tail);
        
        if (tail != null) {
            tail.next = temp;
        }

        tail = temp;

        if (head == null) {
            head = temp;
        }
        size++;
    }
    
    public E removeInitial(){
        SNode <E> temp = head; 
        
        if(size == 0){
            throw new NoSuchElementException();
        }
        head = head.next;
        head.prev = null; 
        size--;
        
        return temp.element;
        }
    
    public boolean contains (E e){
        SNode<E> temp = head;
        for(int i = 0; i < size - 1; i++){
            if(temp.element.equals(e)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void clear(){
        SList<E> newList = new SList<E>();
        newList = this;
        size = 0; 
    }
    
    public void display(){
        SNode<E> temp = head;
        
        for(int i = 0; i < size; i++){
            System.out.print(temp.element + ", ");
            temp = temp.next;
        }
    }

    public SNode<E> getHead() {
        return head;
    }

    public void setHead(SNode<E> head) {
        this.head = head;
    }

    public SNode<E> getTail() {
        return tail;
    }

    public void setTail(SNode<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
    
}