/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleSLL implements DebrisInterface{
    private Node head;
    
    public SmartBubbleSLL(){
        head = null;
    }
    
    @Override
    public int size(){
      return size();
    }
    
    
    @Override
    public void add(DebrisType debris){
        Node newNode = new Node(debris);
        
        if(head == null){
            head = null;
        }else{
            Node curr = head;
            
            while(curr.next != null){
                curr = curr.next;
            }
                curr.next = newNode;
        }
    }
    
    @Override
    public DebrisType remove(){
        if(head == null){
            System.out.println("SLL is empty");
            return null;
        }
            DebrisType debrisRemoved = head.data;
            
            if(head.next == null){
                head = null;
            }else {
                head = head.next;
            }
            return debrisRemoved;
    }
    
    public boolean search(String debrisType) {
        Node current = head;
    while (current != null) {
        if (current.data.getDebrisType().equalsIgnoreCase(debrisType)) {
            return true;
        }
             current = current.next;
    }
         return false;
}
    
    
    
    
}
