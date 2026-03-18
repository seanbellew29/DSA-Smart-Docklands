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
    private Node front;
    private Node back;

    @Override
    public void add(DebrisType debris) {
        Node newNode = new Node(debris);
        if(back == null) 
            front = back = newNode;
        else { 
            back.next = newNode; 
            back = newNode; 
        }
    }

    @Override
    public DebrisType remove() {
        if(front == null) 
           return null;
           DebrisType removed = front.data;
           front = front.next;
        if(front == null)
            back = null;
            return removed;
    }

    @Override
    public boolean isEmpty() {
        return front == null; 
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        Node curr = front;
        while(curr != null) {
            buff.append(curr.data.getDescription()).append("\n");
            curr = curr.next;
        }
        return buff.toString();
    }
}