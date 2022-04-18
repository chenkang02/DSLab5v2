/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1002l5;

/**
 *
 * @author Chen Kang
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        
        list.print();
        list.reverse();
        System.out.println(list.getSize());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove(3);
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.contains('c'));
        list.set(1,'h');
        list.set(2,'e');
        list.set(3,'l');
        list.set(4,'l');
        list.set(5,'o');
        list.print();
        
    }
    
    
    
}
