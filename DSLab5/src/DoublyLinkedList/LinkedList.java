/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @author CHEN KANG
 */
public class LinkedList<E> extends Node<E>{
    
    Node<E> head;
    Node<E> tail; 
    int size;
    
    public LinkedList(){
        
    }
    
    //public Node(E element, Node<E> next, Node<E> prev){
    public void addFirst(E e){
        Node<E> first = new Node<E>(e, head, null);
        if(head != null){
            head.prev = first;
        }
        head = first;
        if(tail == null){
            tail = first;
        }
        size++;
        System.out.println("adding " + e);
    }

    public void addLast(E e) {
        Node<E> last = new Node<E>(e, null, tail);
        if (tail != null) {
            tail.next = last;
        }
        tail = last;
        if (head == null) {
            head = last;
        }
        size++;
        System.out.println("adding " + e);

    }
    
    public void add(E e, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node<E> newNode = new Node<E>(e, temp, temp.prev);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
            System.out.println("adding " + e);
        }
        

    }

    public E removeFirst() {
        Node<E> temp = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast(){
        Node<E> temp = tail;
        if(tail == null){
            throw new NoSuchElementException();
        }
        else{
            tail = tail.prev;
            tail.next = null; 
        }
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E remove(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            removeFirst();
        }
        else if(index == size){
            removeLast();
        }
        else{
            Node<E> temp = head;
            
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            
            element = temp.element;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.println("deleting..." + element);
            
        }
        return element;
    }
    
    public void iterateForward(){
        System.out.println("iterating forward...");
        
        Node<E> temp = head;
        
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println("");
        
    }
    
    
    public void iterateBackward(){
        System.out.println("Iterating backward...");
        
        Node<E> temp = tail;
        
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }
    
    public int getSize(){
        return size;
    }
    
    public void clear() {
        Node<E> temp = head;
        do {
            temp = head.next;
            head.next = head.prev = null;
            head = temp;
        } while (head != null);
        //tail.prev = tail.next = null;
        System.out.println("Successfully cleared " + size + " node(s)");
        size = 0;
    }
    
}
