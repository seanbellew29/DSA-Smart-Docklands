/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleQueue implements DebrisInterface{
    protected Node front;
    protected Node back;
    
    public SmartBubbleQueue(){
        front = null;
        back = null;
    }
    
    @Override
    public int size(){
        return size();
    }
    
    @Override
    public void add(DebrisType debris){
        Node newNode = new Node(debris);
        
        if(back == null){
           front = newNode;
           back = newNode;
        }else{
            back.next = newNode;
            back = newNode;
        }
    }
    @Override
    public DebrisType remove(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        
        DebrisType debrisRemoved = front.data;
        
        if(front == back){
            front = null;
            back = null;
        }else{
            front = front.next;
            
        }
        return debrisRemoved;
    }
    
}
