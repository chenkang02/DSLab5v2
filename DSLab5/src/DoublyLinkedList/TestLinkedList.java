/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author CHEN KANG
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(1);
        numbers.addLast(10);
        numbers.addLast(100);
        numbers.remove(3);
        numbers.add(2,2);
        numbers.iterateForward();
        numbers.iterateBackward();
        System.out.println("size of current Doubly Linked List: " + numbers.getSize());
        numbers.clear();
        System.out.println("size of current Dounly Linked List: " + numbers.getSize());
        numbers.iterateForward();
    }
}
