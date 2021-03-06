/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kindergarten;

import java.util.NoSuchElementException;

/**
 *
 * @author CHEN KANG
 */
public class List<E> extends Node<E> {

    Node<E> head;
    Node<E> tail;
    int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void removeElement(E e) {
        if (tail == null) {
            throw new NoSuchElementException("Name not found.");
        } else {
            int index = 0;
            Node<E> current = head;
            for (int i = 0; i < size; i++) {
                if (current.element.equals(e)) {
                    break;
                }
                current = current.next;
                index++;
            }
            System.out.println(current.element);
            if (current.equals(head)) {
                head = current.next;
            } else if (current.equals(tail)) {
                Node<E> temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp.next;
                tail.next = null;
            } else {
                Node<E> temp = head;
                System.out.println(index);
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                System.out.println(temp.element);
                temp.next = current.next;
            }
            size--;
        }
    }

    public void printList() {
        Node<E> current = head;

        for (int i = 0; i < size - 1; i++) {
            System.out.print(current.element + ", ");
            current = current.next;
        }
        System.out.print(current.element + ".");

    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        Node<E> current = head;

        while (current != null) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void replace(E e, E newE) {
        int index = 0;
        Node<E> temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.element.equals(e)) {
                break;
            }
            index++;
            temp = temp.next;
        }

        if (temp == null) {
            throw new NoSuchElementException("Name not found.");
        } else {
            temp = head;
            Node<E> newNode = new Node<E>(newE);
            if (index == 0) {
                newNode.next = head.next;
                head = newNode;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = (temp.next).next;
                temp.next = newNode;
            }
        }
    }

}
