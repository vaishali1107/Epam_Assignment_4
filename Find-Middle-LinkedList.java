import java.util.*;
class MiddleLinkedList{
 static Node head;
  static class Node{
   int data;
   Node next;
   Node(int d)
   {
   data=d;
   next=null;
   }
  }
   public void push(int new_data) 
    { 
        
        Node new_node = new Node(new_data); 
  
       
        new_node.next = head; 
  
        
        head = new_node; 
    } 
  public static void FindMiddle()
  {
	  Node first=head,second=head;
	  if(head!=null){
	  while (second != null && second.next != null) { 
            first= first.next; 
            second = second.next.next; 
  
            
	  }
                System.out.println(first.data);
				
	  }
  }
  

public static void main(String[] args)
{ 
     LinkedList list=new LinkedList();
	 for(int i=1;i<6;i++)
	 {
	 list.push(i);
	 }
	 FindMiddle();
}

}