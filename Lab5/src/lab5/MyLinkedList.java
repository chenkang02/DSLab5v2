/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1002l5;

import java.util.ArrayList;

/**
 *
 * @author Chen Kang
 */
public class MyLinkedList<E> extends Node<E> {

    Node<E> head;
    Node<E> tail;

    int size = 0;

    public MyLinkedList() {

    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);

        newNode.next = head;
        head = newNode;

        size++;

        if (tail == null) {
            tail = head;
        }

    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<E>(e);
        Node<E> current = head;
        if (index >= size) {
            addLast(e);
        } else if (index == 0) {
            addFirst(e);
        } else {
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = newNode;
            (current.next).next = temp;

            size++;

        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }
        Node<E> removed = head;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return removed.element;

    }

    public E removeLast() {

        Node<E> current = head;
        Node<E> removed;
        if (head == null & tail == null) {
            return null;
        } else if (size == 1) {
            removed = head;
            head = tail = null;
            size = 0;
            return removed.element;
        } else {
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            removed = tail;
            tail = current;
            tail.next = null;
            size--;
            return removed.element;
        }

    }

    public E remove(int index) {

        if (index == size - 1) {
            return removeLast();
        } else if (index == 0) {
            return removeFirst();
        } else {
            Node<E> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node<E> removed = current.next;
            current.next = removed.next;
            size--;
            return removed.element;
        }
    }
    
    public void add(E e){
        addLast(e);
    }
    
    public boolean contains(E e) {
        Node<E> current = head;

        for (int i = 0; i < size - 2; i++) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        Node<E> current = head;
         
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        
        return current.element;
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public int indexOf(E e){
        Node<E> current = head;
        int index = 0;
        
        for(int i = 0; i < index - 1; i++){
            if(current.element.equals(e)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
        
    }
    
    public int lastIndexOf(E e){
        Node<E> current = head;
        int lastIndex = 0; 
        if(contains(e)){
        for(int i = 0; i < size - 2; i++){
            if(current.element.equals(e)){
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
        }
        else{
            return -1;
        }
    }
    
    
    public E set(int index, E e){
        Node<E> current = head;
        Node<E> newNode = new Node<E>(e);
        
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        
        Node<E> temp = current.next;
        current.next = newNode;
        newNode.next = (current.next).next;
        
        return temp.element;
    }
    
    public void clear(){
        Node<E> temp = head;
        
        
    }
    
    public void print() {
        Node<E> current = head;
        while (true) {
            System.out.println(current.element);

            if (current.next == null) {
                break;
            }
            current = current.next;

        }

    }
    
    public void reverse(){
        Node<E> current = head; 
        ArrayList<E> array = new ArrayList<>();
       
       while(true){
           array.add(current.element);
           if(current.next == null){
               break;
           }
           current = current.next;
       }
        
        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.println(array.get(i));
        }
    }

    public int getSize() {
        return size;
    }
    
    

}
