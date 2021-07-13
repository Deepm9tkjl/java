package module.linklist;

import java.util.LinkedList;

public class intr {
    public static class Node{
        int data;
        Node next;
    }
    public static class linklist{
        int size;
        Node head, tail; 
        void addLast(int val){
            Node node =new Node();
            node.data=val;
            if(this.size==0){
                this.head=this.tail=node;

            }else {
                this.tail.next=node;
                this.tail=node;
            }
            this.size++;
        }
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
    }
}
