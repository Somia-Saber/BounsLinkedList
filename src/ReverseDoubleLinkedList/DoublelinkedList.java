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
public class DoublelinkedList {
        Node head;
        Node tail;
        int elementCount;
        public DoublelinkedList(){
            head = null;
            tail =null;
            elementCount = 0;
        }
        
        public boolean isEmpty(){
            return (elementCount == 0);
        }
        public  void insertFirst(int data){
            Node myNode = new Node(data);
            if (isEmpty()){
                head =tail= myNode;
                
            }
            else{
                head.previous=myNode;
                myNode.next = head;
                head = myNode;
            }
            elementCount++;
        }
        public void insertLast(int data){
            Node myNode = new Node(data);
            if(isEmpty()){
                head =tail= myNode;
            }
            else{
               tail.next=myNode;
               myNode.previous=tail;
               tail=myNode;
            }
            elementCount++;
        }
        public void insertAt(int pos, int data){
            Node myNode = new Node(data);
            if (pos == 0){
                insertFirst(data);
            }
            else{
                Node temp = head;
                for (int i =0;i<pos-1;i++){
                    temp = temp.next;
                }
                myNode.next = temp.next;
                temp.next = myNode;
                myNode.previous=temp;
                temp.next.previous=myNode;
            }
            elementCount++;
        }
        public int removeFirst(){
            int val;
            if(head.next == null){
                val = head.data;
                head = tail=null;
            }
            else{
                val = head.data;
                head = head.next;
                head.previous=null;
            }
            elementCount--;
            return val;
        }
        public int removeLast(){
            int val;
            if(head.next == null){
                val = head.data;
                head =tail= null;
            }
            else{
               val=tail.data;
               tail.previous=tail;
               tail.next=null;
               
            }
            elementCount--;
            return val;
        }
        int deleteAt (int index)
        {
            int val ;
            if(index==0)
            {
                if(head.next==null)
                {
                 val=head.data;
                 head=null;
                }
                else
                {
                  val=head.data;
                  head=head.next;  
                }
            }
            else
            {   Node temp=head;
                //Node tobedeleted;
                for(int i=0; i<index-1;i++)
               {
                   temp=temp.next;
               }
                val=temp.next.data;
                temp.next=temp.next.next;
                temp.next.previous=temp;
                
                
            }
            elementCount--;  
            return val;
        }
        
        public int count(){
            return elementCount;
        }
        public void displayForward(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        
         public void displayBackward(){
            Node temp = tail;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.previous;
            }
        }
}
