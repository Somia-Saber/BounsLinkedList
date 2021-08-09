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
        public  void insertFirst(int data,int data1){
            Node myNode = new Node(data,data1);
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
        public void insertLast(int data,int data1,int data2,int data3,int data4,int data5){
            Node myNode = new Node(data,data1);
            if(isEmpty()){
                head =tail= myNode;
            }
            else{
               tail.next=myNode;
               myNode.previous=tail;
               tail=myNode;
               String x="x";
          int n=Integer.parseInt(x);
          double k=n;
          
          double j=Math.pow(k, data1);
          double b=Math.pow(k, data2);
          double h=Math.pow(k, data3);
               System.out.println(data+Math.pow(k, data1)+"+"+data2+Math.pow(k, data3)+"+"+data4+Math.pow(k, data5));

            }
            elementCount++;
        }
        public void insertAt(int pos, int data,int data1){
            Node myNode = new Node(data,data1);
            if (pos == 0){
                insertFirst(data,data1);
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
                String r=Integer.toString(temp.data);
                String t=Integer.toString(temp.data1);

                System.out.println(r+"," +t);
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
         
      public void polynmial(int data ,int data1,int data2,int data3,int data4,int data5){
          String x="x";
//          int n=Integer.parseInt(x);
//          double k=n;
//          
//          double j=Math.pow(k, data1);
//          double b=Math.pow(k, data2);
//          double h=Math.pow(k, data3);
      System.out.println(data+"x"+"+"+data1+"x"+"+"+data3+"x");
      
      
      }         
         
         
}
