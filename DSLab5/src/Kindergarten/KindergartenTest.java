/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kindergarten;

import java.util.Scanner;

/**
 *
 * @author CHEN KANG
 */
public class KindergartenTest {
    public static void main(String[] args) {
        
        String input = ""; 
        List<String> name = new List<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end......");
        input = sc.nextLine();
        while (!input.equals("n")) {
            name.add(input);
            input = sc.nextLine();
        }
        
        System.out.println("You have enter the following students' name: ");
        name.printList();
        System.out.println("");
        System.out.println("The number of students entered is : " + name.getSize());
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String decision = sc.nextLine();
        
        //key rename
        while (!decision.equals("n") && decision.equals("r")) {
            System.out.println("Enter the existing student name that you want to rename: ");
            String name1 = sc.nextLine();

            System.out.println("Enter the new name: ");
            String newName = sc.nextLine();
            name.replace(name1, newName);
            System.out.println("The new student list is: ");
            name.printList();
            System.out.println("");
            System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
            decision = sc.nextLine();

        }
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        String decision1 = sc.nextLine();
        
        while(!decision1.equals("n")){
            System.out.println("Enter a student name to remove: ");
            String name2 = sc.nextLine();
            
            if(name.contains(name2)){
                name.removeElement(name2);
            }
            else{
                System.out.println("No name found.");
            }
            System.out.println("The number of updated student is: " + name.getSize());
            System.out.println("The updated students list is: ");
            name.printList();
            System.out.println("");
            System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
            decision1 = sc.nextLine();
        }
        
        System.out.println("All students data captured complete. Thank you!");
        
    }
}
