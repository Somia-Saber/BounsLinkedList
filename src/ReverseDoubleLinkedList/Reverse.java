/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseDoubleLinkedList;

/**
 *
 * @author somia saber
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublelinkedList l=new DoublelinkedList();
        l.insertFirst(1);
        l.insertLast(2);
        l.insertLast(3);
        l.displayForward();
        System.out.println("-------------------");
        l.displayBackward();
    }
    
}
