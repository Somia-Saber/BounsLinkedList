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
public class Node{
        int data;
        int data1;
        Node next;
        Node previous;
        public Node(int data,int data1){
            this.data = data;
            this.data1=data1;
            next = null;
            previous=null;
        }
    }