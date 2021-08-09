/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polynomial_Representation;

/**
 *
 * @author somia saber
 */
public class Polynomial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     DoublelinkedList l=new DoublelinkedList();
//     l.insertFirst(5, 3);
     l.insertLast(4,2,4,2,2,0);
//     l.insertLast(2, 0);
     l.displayForward();
//     l.polynmial(5, 3, 4, 2, 2, 0);
    }
    
}
