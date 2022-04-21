/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slist;

import java.util.ArrayList;

/**
 *
 * @author Chen Kang
 */
public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy.");
        
        list.display();
        System.out.println("");
        String s1 = list.removeInitial();
        System.out.println(s1);
        boolean contains = list.contains("difficult");
        System.out.println(contains);
        
        list.clear();
        list.display();
        
        
        
    }
    
    
}
