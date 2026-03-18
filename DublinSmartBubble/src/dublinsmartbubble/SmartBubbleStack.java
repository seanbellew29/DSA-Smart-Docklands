/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleStack implements DebrisInterface{
    
    protected Node front;
    
    @Override
    public int size(){
        return size();
    }
    
    @Override
    public void add(DebrisType debris){
        Node newNode = new Node(debris);
        
        newNode.next = front;
        front = newNode;
        
    }
    @Override
    public DebrisType remove(){
        if(front == null){
            System.out.println("Stack is empty");
            return null;
        }
        
        DebrisType debrisRemoved = front.data;
        
        if(front.next == null){
            front = null;
        }else{
            front = front.next;
        }
        return debrisRemoved;
    }
    
    
}
